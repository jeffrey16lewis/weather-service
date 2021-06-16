package com.api.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsolidatedWeather {
    @JsonProperty("applicable_date")
    private String applicableDate;
    @JsonProperty("weather_state_name")
    private String weatherStateName;
}
