package com.colloquio.service;

import com.colloquio.model.Stay;

import java.util.List;

public interface StayService {

    Stay create(Stay stay);

    List<Stay> getStayByItineraryId(int id);

}
