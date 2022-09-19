package com.ahmedeid.getcountry.country;

import com.ahmedeid.getcountry.country.dto.CountryDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class CountryApplicationTests {

	@Autowired
	private CountryService countryService;

	@Test
	void getCountryInfoGetNull() {
		CountryDto countryDto = this.countryService.getCountryInfo("BHRS");
		assertNull(countryDto.getName());
		assertNull(countryDto.getContinent());
		assertNull(countryDto.getCountryLanguage());
	}

	@Test
	void getCountryInfo() {
		CountryDto countryDto = this.countryService.getCountryInfo("BHR");
		assertEquals(countryDto.getName(), "Bahrain");
		assertEquals(countryDto.getContinent(), "Asia");
		assertEquals(countryDto.getCountryLanguage(), "Arabic");
	}

}
