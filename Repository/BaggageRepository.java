package com.AirportBaggageModule.Repository;

import com.AirportBaggageModule.Entity.Baggage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaggageRepository extends JpaRepository<Baggage, Long> {
}
