package lk.ijse.parking_service.dto;

import jakarta.validation.constraints.NotBlank;
import lk.ijse.parking_service.entity.ParkingSpace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpaceDTO {
    private Long id;

    @NotBlank(message = "Location is mandatory")
    private String location;

    private String zone;

    private Long ownerId;

    private ParkingSpace.Status status;

}
