package lk.ijse.parking_service.repo;

import lk.ijse.parking_service.entity.ParkingSpaceDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParkingSpaceDetailsRepo extends JpaRepository<ParkingSpaceDetails, Long> {
    List<ParkingSpaceDetails> findByParkingSpaceId(Long spaceId);
}
