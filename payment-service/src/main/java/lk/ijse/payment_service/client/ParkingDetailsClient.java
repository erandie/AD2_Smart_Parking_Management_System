package lk.ijse.payment_service.client;

import lk.ijse.payment_service.dto.ParkingDetailsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "parking-space-service")
public interface ParkingDetailsClient {

    @GetMapping("/api/parking-spaces/details/detail/{detailId}")
    ParkingDetailsResponse getParkingDetailsById(@PathVariable("detailId") Long detailId);
}

