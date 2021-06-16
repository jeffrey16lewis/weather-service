package com.api.weather.controller;

import com.api.weather.model.WeatherInfo;
import com.api.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
@CrossOrigin
public class WeatherController {
    private final WeatherService weatherService;
    @CrossOrigin
    @GetMapping("/{city}")
    public ResponseEntity<String> getLocationsByCity(@PathVariable String city) {
        return weatherService.getLocationByCity(city);
    }

    @GetMapping("/info/{woeId}")
    public ResponseEntity<WeatherInfo> getLocationsByWoeId(@PathVariable String woeId) {
        return weatherService.getLocationByWoeId(woeId);
    }
}
