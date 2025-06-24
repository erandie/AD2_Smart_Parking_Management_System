package lk.ijse.parking_service.service;

import lk.ijse.parking_service.entity.ParkingSpaceDetails;

import java.util.List;

public interface ParkingSpaceServiceDetails {

    ParkingSpaceDetails addParkingDetail(Long spaceId, ParkingSpaceDetails detail);
    List<ParkingSpaceDetails> getDetailsBySpace(Long spaceId);
    void deleteDetail(Long detailId);
    ParkingSpaceDetails getDetailById(Long detailId);

}
