package com.colloquio.repository;

import com.colloquio.model.City;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CityRepository {

    String SELECT_FROM_CITY_WHERE_ID = "SELECT * FROM city WHERE id = #{id}";
    String SELECT_FROM_CITY_WHERE_NAME = "SELECT * FROM city WHERE name = #{name}";

    String SELECT_FROM_CITY_WHERE_NAME_LATITUDE_LONGITUDE = "SELECT * FROM city WHERE name = #{name} AND latitude = #{latitude} AND longitude = #{longitude}";

    @Insert("INSERT INTO city(name, latitude, longitude) " +
            " VALUES (#{name}, #{latitude}, #{longitude})")
    void insert(City city);

    @Select(SELECT_FROM_CITY_WHERE_NAME_LATITUDE_LONGITUDE)
    City findCity(String name, double latitude, double longitude);

    @Select(SELECT_FROM_CITY_WHERE_NAME)
    City findCityByName(String name);

    @Select(SELECT_FROM_CITY_WHERE_ID)
    City findCityById(int id);

    @Delete("DELETE FROM city WHERE id = #{id}")
    boolean deleteById(int id);
}
