package com.ahmedeid.getcountry.country.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Country {
    @Id
    private String code;

    private String name;
    private String region;

    @Column(name = "surface_area")
    private float surfaceArea;

    private String continent;

    @Column(name = "indep_year")
    private Integer indepYear;

    private int population;

    @Column(name = "life_expectancy")
    private Float lifeExpectancy;

    private Double gnp;

    @Column(name = "gnp_old")
    private Double gnpOld;

    @Column(name = "local_name")
    private String localName;

    @Column(name = "government_form")
    private String governmentForm;

    @Column(name = "head_of_state")
    private String headOfState;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "capital")
    private City capital;
    private String code2;

}
