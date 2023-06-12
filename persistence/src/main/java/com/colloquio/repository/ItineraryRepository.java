package com.colloquio.repository;

import com.colloquio.model.Itinerary;
import com.colloquio.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ItineraryRepository {

    String SELECT_FROM_ITINERARY_WHERE_USERID = "SELECT * FROM itinerary WHERE user_id = #{userId}";

    @Result(property = "itineraryStatusId", column = "itinerary_status_id")
    @Select(SELECT_FROM_ITINERARY_WHERE_USERID)
    List<Itinerary> findItineraryByUserId(int userId);

    String SELECT_FROM_ITINERARY_WHERE_USERNAME = "SELECT i.*" +
            " FROM Itinerary i" +
            " INNER JOIN User u ON i.user_id = u.id" +
            " WHERE u.username = #{username}";


    @Result(property = "itineraryStatusId", column = "itinerary_status_id")
    @Select(SELECT_FROM_ITINERARY_WHERE_USERNAME)
    List<Itinerary> findItineraryByUsername(String username);

    @Insert("INSERT INTO itinerary(user_id, description, startDate, endDate, itinerary_status_id) " +
            " VALUES (#{userId}, #{description}, #{startDate}, #{endDate}, #{itineraryStatusId})")
    void insert(Itinerary itinerary);

    String SELECT_FROM_ITINERARY_WHERE_ID = "SELECT * FROM itinerary WHERE id = #{id}";
    @Select(SELECT_FROM_ITINERARY_WHERE_ID)
    User findById(int id);

    @Insert("UPDATE itinerary SET itinerary_status_id = #{itineraryStatusId} WHERE id = #{id}")
    void updateItineraryStatus(Itinerary itinerary);


}
