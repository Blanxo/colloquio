package com.colloquio.repository.impl;

import com.colloquio.repository.OpenMeteoMapper;
import com.colloquio.model.SkyCondition;
import com.colloquio.model.WeatherConditions;
import com.colloquio.model.WeatherDataOpenMeteo;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class OpenMeteoMapperImpl implements OpenMeteoMapper {


    /*
    Mi calcolo la media giornaliera per le varie condizioni (tra le richieste c'è la temperatura giornaliera ma l'API fornisce solo quella oraria
    Per calcolare lo status di SkyCondition dò priorità alle precipitazioni nevose, poi piovose e solo se queste ultime sono sotto un determinato limite
    imposto nuvoloso.
     */
    @Override
    public WeatherConditions convertFromWeatherDataOpenMeteo(WeatherDataOpenMeteo weatherData) {
        WeatherConditions weatherConditions = new WeatherConditions();
        // Prendo la media di rain, snowfall e cloudy per calcolare le condizioni meteorologiche
        Double rainAverage = Arrays.stream(weatherData.getHourly().getRain())
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        Double snowfallAverage = Arrays.stream(weatherData.getHourly().getSnowfall())
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        Double cloudyAverage = Arrays.stream(weatherData.getHourly().getCloudCover())
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        SkyCondition skyCondition;
        if(cloudyAverage > 35d && snowfallAverage < 35d && rainAverage < 35d) {
            skyCondition = SkyCondition.CLOUDY;
        } else if (snowfallAverage < 35d && rainAverage < 35d) {
            skyCondition = SkyCondition.CLEAR_SKY;
        } else if (snowfallAverage >= rainAverage){
            skyCondition = SkyCondition.SNOW_SHOWERS;
        } else {
            skyCondition = SkyCondition.RAIN_SHOWERS;
        }
        Double temperatureAverage = Arrays.stream(weatherData.getHourly().getTemperature2M())
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        Double humidityAverage = Arrays.stream(weatherData.getHourly().getRelativeHumidity2M())
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        weatherConditions.setSkyConditionId(skyCondition.getId());
        weatherConditions.setHumidity(humidityAverage);
        weatherConditions.setTemperature(temperatureAverage);
        return weatherConditions;
    }
}
