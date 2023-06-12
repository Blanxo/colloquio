package com.colloquio.service.impl;

import com.colloquio.repository.ItineraryRepository;
import com.colloquio.model.Itinerary;
import com.colloquio.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItineraryServiceImpl implements ItineraryService {

    @Autowired
    private ItineraryRepository repository;

    @Override
    public Itinerary create(Itinerary itinerary) {
        // Gli itinerari non hanno un nome, è da definire se ci sono dei modi per distinguere un itinerario da un altro (eccetto la primary key)
        repository.insert(itinerary);
        return itinerary;
    }

    @Override
    public List<Itinerary> getItinerariesByUsername(String username) {
        return repository.findItineraryByUsername(username);
    }

    @Override
    public List<Itinerary> getItinerariesByUserId(int userId) {
        return repository.findItineraryByUserId(userId);
    }

    @Override
    public void update(Itinerary itinerary) {
        repository.updateItineraryStatus(itinerary);
    }
}
