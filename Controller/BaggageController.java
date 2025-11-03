package com.AirportBaggageModule.Controller;

import com.AirportBaggageModule.Entity.Baggage;
import com.AirportBaggageModule.Service.BaggageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/baggage")
@CrossOrigin("*") // allows access from frontend or Postman
public class BaggageController {

    @Autowired
    private BaggageService baggageService;  // ✅ use same name everywhere

    // ✅ Store baggage
    //http://localhost:8080/baggage/store
    @PostMapping("/store")
    public ResponseEntity<String> storeBaggage(@RequestBody Baggage baggage) {
        baggageService.storeBaggage(baggage);
        return ResponseEntity.ok("Baggage stored successfully!");
    }

    // ✅ Get all baggage
    //http://localhost:8080/baggage/all
    @GetMapping("/all")
    public ResponseEntity<List<Baggage>> getAllBaggage() {

        return ResponseEntity.ok(baggageService.getAllBaggage());
    }

    // ✅ Delete baggage (DELETE)
    // http://localhost:8080/baggage/delete/{id}
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBaggage(@PathVariable Long id) {
        boolean deleted = baggageService.deleteBaggage(id);
        if (deleted) {
            return ResponseEntity.ok("Baggage deleted successfully!");
        } else {
            return ResponseEntity.status(404).body("Baggage not found!");
        }
    }
}
