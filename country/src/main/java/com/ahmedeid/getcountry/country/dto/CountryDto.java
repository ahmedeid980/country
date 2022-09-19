package com.ahmedeid.getcountry.country.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class CountryDto {
    private String name;
    private String continent;
    private int population;
    @JsonProperty("life_expectancy")
    private int lifeExpectancy;
    @JsonProperty("country_language")
    private String countryLanguage;
}
