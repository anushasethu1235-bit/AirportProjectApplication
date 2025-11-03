package com.AirportBaggageModule.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Baggage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tagNumber;
    private String storageSection;
    private boolean hasConnectedFlight;
    private String destinationAirport;

//    public boolean isHasConnectedFlight() {
//    }
//
//    public String getDestinationAirport() {
//    }
}
