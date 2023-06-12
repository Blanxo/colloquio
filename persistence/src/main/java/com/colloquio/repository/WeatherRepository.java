package com.colloquio.repository;

import com.colloquio.model.WeatherConditions;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WeatherRepository {

    String SELECT_FROM_WEATHER_WHERE_ID = "SELECT * FROM WeatherConditions WHERE id = #{id}";

    @Select(SELECT_FROM_WEATHER_WHERE_ID)
    WeatherConditions findWeatherById(int id);

    @Insert("INSERT INTO WeatherConditions(temperature, humidity, skyCondition_id) " +
            " VALUES (#{temperature}, #{humidity}, #{skyConditionId})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(WeatherConditions weatherConditions);

}
