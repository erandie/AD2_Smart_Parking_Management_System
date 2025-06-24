package lk.ijse.parking_service.repo;

import lk.ijse.parking_service.entity.ParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSpaceRepo extends JpaRepository<ParkingSpace, Long> {

}
