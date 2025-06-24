package lk.ijse.parking_service.service.impl;

import lk.ijse.parking_service.entity.ParkingSpace;
import lk.ijse.parking_service.entity.ParkingSpaceDetails;
import lk.ijse.parking_service.repo.ParkingSpaceDetailsRepo;
import lk.ijse.parking_service.repo.ParkingSpaceRepo;
import lk.ijse.parking_service.service.ParkingSpaceServiceDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;

@Service
public class ParkingSpaceServiceDetailsImpl implements ParkingSpaceServiceDetails {

    @Autowired
    private ParkingSpaceRepo parkingSpaceRepo;

    @Autowired
    private ParkingSpaceDetailsRepo parkingSpaceDetailsRepo;


    // --- ParkingSpaceDetails logic ---

    @Override
    public ParkingSpaceDetails addParkingDetail(Long spaceId, ParkingSpaceDetails detail) {
        ParkingSpace space = parkingSpaceRepo.findById(spaceId)
                .orElseThrow(() -> new RuntimeException("Parking space not found"));
        detail.setParkingSpace(space);

        if (detail.getEntryTime() != null && detail.getExitTime() != null) {
            long duration = Duration.between(detail.getEntryTime(), detail.getExitTime()).toMinutes();
            detail.setDuration(duration);
        }

        return parkingSpaceDetailsRepo.save(detail);
    }

    @Override
    public List<ParkingSpaceDetails> getDetailsBySpace(Long spaceId) {
        return parkingSpaceDetailsRepo.findByParkingSpaceId(spaceId);
    }

    @Override
    public void deleteDetail(Long detailId) {
        parkingSpaceDetailsRepo.deleteById(detailId);
    }

    @Override
    public ParkingSpaceDetails getDetailById(Long detailId) {
        return parkingSpaceDetailsRepo.findById(detailId)
                .orElseThrow(() -> new RuntimeException("Parking detail not found with id: " + detailId));
    }

}
