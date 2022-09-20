package com.ahmedeid.getcountry.country.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryDto {
    private String name;
    private String continent;
    private Integer population;
    @JsonProperty("life_expectancy")
    private Integer lifeExpectancy;
    @JsonProperty("country_language")
    private String countryLanguage;
}
