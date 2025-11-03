package com.AirportBaggageModule.Service;

import com.AirportBaggageModule.Entity.Baggage;
import java.util.List;

public interface BaggageService {
    Baggage storeBaggage(Baggage baggage);
    List<Baggage> getAllBaggage();

    boolean deleteBaggage(Long id);
}
