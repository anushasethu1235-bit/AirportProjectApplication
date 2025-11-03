package com.AirportBaggageModule.Service;

import com.AirportBaggageModule.Entity.Baggage;
import com.AirportBaggageModule.Repository.BaggageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BaggageServiceImpl implements BaggageService {

    @Autowired
    private BaggageRepository baggageRepository;

    @Override
    public Baggage storeBaggage(Baggage baggage) {
        return baggageRepository.save(baggage);
    }

    @Override
    public List<Baggage> getAllBaggage() {
        return baggageRepository.findAll();
    }

    public boolean deleteBaggage(Long id) {
        if (baggageRepository.existsById(id)) {
            baggageRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
