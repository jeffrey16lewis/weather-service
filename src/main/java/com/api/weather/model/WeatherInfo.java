package com.api.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherInfo {
    @JsonProperty("title")
    private String title;
    @JsonProperty("consolidated_weather")
    private ConsolidatedWeather[] consolidatedWeather;

}