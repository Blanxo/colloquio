package com.colloquio.service.impl;

import com.colloquio.model.Stay;
import com.colloquio.repository.StayRepository;
import com.colloquio.service.StayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StayServiceImpl implements StayService {

    @Autowired
    private StayRepository repository;

    @Override
    public Stay create(Stay stay) {
        repository.insert(stay);
        return stay;
    }

    @Override
    public List<Stay> getStayByItineraryId(int id) {
        return repository.findStayByItineraryId(id);
    }


}
