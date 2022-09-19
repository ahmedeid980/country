package com.ahmedeid.getcountry.country.controller;

import com.ahmedeid.getcountry.country.service.CountryService;
import com.ahmedeid.getcountry.country.dto.CountryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{countryCode}")
    public CountryDto getCountryInfo(@PathVariable String countryCode) {
        return this.countryService.getCountryInfo(countryCode);
    }
}
