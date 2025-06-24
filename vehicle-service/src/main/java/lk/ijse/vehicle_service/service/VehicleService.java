package lk.ijse.vehicle_service.service;

import lk.ijse.vehicle_service.dto.VehicleDTO;
import lk.ijse.vehicle_service.dto.VehicleResponse;
import lk.ijse.vehicle_service.entity.Vehicle;
import java.util.List;
import java.util.Optional;

public interface VehicleService {
    Vehicle registerVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    Optional<Vehicle> getVehicleById(Long id);
    public List<VehicleResponse> getVehiclesByUserId(Long userId);
    Vehicle updateVehicleStatus(Long id, String status);
    Vehicle updateVehicle(Long id, VehicleDTO dto);
    void deleteVehicleById(Long id);
}
