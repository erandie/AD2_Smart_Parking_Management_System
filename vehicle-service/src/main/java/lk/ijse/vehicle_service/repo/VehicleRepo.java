package lk.ijse.vehicle_service.repo;

import lk.ijse.vehicle_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepo extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByUserId(Long userId);
}
