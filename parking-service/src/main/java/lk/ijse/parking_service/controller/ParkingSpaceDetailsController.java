package lk.ijse.parking_service.controller;

import lk.ijse.parking_service.entity.ParkingSpaceDetails;
import lk.ijse.parking_service.service.ParkingSpaceServiceDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parking-spaces/details")
public class ParkingSpaceDetailsController {

    @Autowired
    private ParkingSpaceServiceDetails parkingSpaceDetailsService;


    // --- ParkingSpaceDetails CRUD ---

    @PostMapping("/{spaceId}/details")
    public ResponseEntity<ParkingSpaceDetails> addDetail(
            @PathVariable Long spaceId,
            @RequestBody ParkingSpaceDetails detail) {
        ParkingSpaceDetails created = parkingSpaceDetailsService.addParkingDetail(spaceId, detail);
        return ResponseEntity.ok(created);
    }

    @GetMapping("/{spaceId}/details")
    public ResponseEntity<List<ParkingSpaceDetails>> getDetails(@PathVariable Long spaceId) {
        return ResponseEntity.ok(parkingSpaceDetailsService.getDetailsBySpace(spaceId));
    }

    @DeleteMapping("/details/{detailId}")
    public ResponseEntity<Void> deleteDetail(@PathVariable Long detailId) {
        parkingSpaceDetailsService.deleteDetail(detailId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/detail/{detailId}")
    public ResponseEntity<ParkingSpaceDetails> getDetailById(@PathVariable Long detailId) {
        ParkingSpaceDetails detail = parkingSpaceDetailsService.getDetailById(detailId);
        return ResponseEntity.ok(detail);
    }

}
