package com.colloquio.repository;

import com.colloquio.model.Stay;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StayRepository {

    String SELECT_FROM_STAY_WHERE_ITINERAYID = "SELECT * FROM STAY WHERE itinerary_id = #{id}";

    @Select(SELECT_FROM_STAY_WHERE_ITINERAYID)
    List<Stay> findStayByItineraryId(int id);

    @Insert("INSERT INTO Stay(itinerary_id, stayDate, description, city_id, weather_id) " +
            " VALUES (#{itineraryId}, #{stayDate}, #{description}, #{cityId}, #{weatherId})")
    void insert(Stay stay);

}
