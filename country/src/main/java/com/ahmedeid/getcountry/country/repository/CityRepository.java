package com.ahmedeid.getcountry.country.repository;

import com.ahmedeid.getcountry.country.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
