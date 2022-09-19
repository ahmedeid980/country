package com.ahmedeid.getcountry.country.repository;

import com.ahmedeid.getcountry.country.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
