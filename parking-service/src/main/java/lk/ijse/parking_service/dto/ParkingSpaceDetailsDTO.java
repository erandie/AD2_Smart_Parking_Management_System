package lk.ijse.parking_service.dto;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lk.ijse.parking_service.entity.ParkingSpace;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParkingSpaceDetailsDTO {
    private Long id;

    private String numberPlate;

    private LocalDateTime entryTime;

    private LocalDateTime exitTime;

    private Long duration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parking_space_id")
    private ParkingSpace parkingSpace;
}

