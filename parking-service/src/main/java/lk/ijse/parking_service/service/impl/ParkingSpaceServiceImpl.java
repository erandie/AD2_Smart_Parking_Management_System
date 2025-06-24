package lk.ijse.parking_service.service.impl;

import lk.ijse.parking_service.entity.ParkingSpace;
import lk.ijse.parking_service.repo.ParkingSpaceDetailsRepo;
import lk.ijse.parking_service.repo.ParkingSpaceRepo;
import lk.ijse.parking_service.service.ParkingSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParkingSpaceServiceImpl implements ParkingSpaceService {

    @Autowired
    private ParkingSpaceRepo parkingSpaceRepo;

    @Autowired
    private ParkingSpaceDetailsRepo parkingSpaceDetailsRepo;


    @Override
    public ParkingSpace createParkingSpace(ParkingSpace space) {
        if (space.getStatus() == null) {
            space.setStatus(ParkingSpace.Status.AVAILABLE);
        }
        return parkingSpaceRepo.save(space);
    }

    @Override
    public List<ParkingSpace> getAllParkingSpaces() {
        return parkingSpaceRepo.findAll();
    }

    @Override
    public Optional<ParkingSpace> getParkingSpaceById(Long id) {
        return parkingSpaceRepo.findById(id);
    }

    @Override
    public ParkingSpace updateStatus(Long id, ParkingSpace.Status status) {
        ParkingSpace space = parkingSpaceRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Parking space not found"));
        space.setStatus(status);
        return parkingSpaceRepo.save(space);
    }

    @Override
    public void deleteParkingSpace(Long id) {
        parkingSpaceRepo.deleteById(id);
    }

    // --- ParkingSpaceDetails logic ---

}
