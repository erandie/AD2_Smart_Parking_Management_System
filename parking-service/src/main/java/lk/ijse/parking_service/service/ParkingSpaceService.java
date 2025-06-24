package lk.ijse.parking_service.service;

import lk.ijse.parking_service.entity.ParkingSpace;

import java.util.List;
import java.util.Optional;

public interface ParkingSpaceService {
    ParkingSpace createParkingSpace(ParkingSpace space);
    List<ParkingSpace> getAllParkingSpaces();
    Optional<ParkingSpace> getParkingSpaceById(Long id);
    ParkingSpace updateStatus(Long id, ParkingSpace.Status status);
    void deleteParkingSpace(Long id);

}
