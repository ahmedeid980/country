package com.ahmedeid.getcountry.country.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class City {

    @Id
    private int id;
    private String name;

    @Column(name = "country_code")
    private String countryCode;

    private String district;
    private int population;
}
