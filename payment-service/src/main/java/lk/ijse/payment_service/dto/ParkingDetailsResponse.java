package lk.ijse.payment_service.dto;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class ParkingDetailsResponse {
    private Long id;
    private String numberPlate;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Long duration;
    // getters and setters
}

