package com.ahmedeid.getcountry.country.service;

import com.ahmedeid.getcountry.country.dto.CountryDto;
import com.ahmedeid.getcountry.country.model.Country;
import com.ahmedeid.getcountry.country.model.CountryLanguage;
import com.ahmedeid.getcountry.country.repository.CityRepository;
import com.ahmedeid.getcountry.country.repository.CountryLanguageRepository;
import com.ahmedeid.getcountry.country.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CountryService {

    @Autowired
    private CountryLanguageRepository countryLanguageRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public CountryDto getCountryInfo(final String countryCode) {
        CountryDto countryDto = new CountryDto();
        this.countryRepository.findById(countryCode).ifPresent(countryInfo -> {
            countryDto.setName(countryInfo.getName());
            countryDto.setContinent(countryInfo.getContinent());
            countryDto.setPopulation(countryInfo.getCapital().getPopulation());
            countryDto.setLifeExpectancy(countryInfo.getLifeExpectancy().intValue());
            List<CountryLanguage> countryLanguage = this.countryLanguageRepository.findAll();
            countryLanguage.stream().filter((language -> language.getCountryCode().equals(countryCode)
                    && language.isOfficial())
            ).findFirst().ifPresent((languageFound) -> countryDto.setCountryLanguage(languageFound.getLanguage()));
        });
        return countryDto;

    }

}
