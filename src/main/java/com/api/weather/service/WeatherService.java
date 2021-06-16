package com.api.weather.service;

import com.api.weather.model.WeatherInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final RestTemplate restTemplate;

    public ResponseEntity<String> getLocationByCity(String city) {
        return restTemplate.getForEntity("https://www.metaweather.com/api/location/search/?query="+city, String.class);
    }

    public ResponseEntity<WeatherInfo> getLocationByWoeId(String woeId) {
        return ResponseEntity.ok(restTemplate.getForObject("https://www.metaweather.com/api/location/"+woeId, WeatherInfo.class));
    }
}
