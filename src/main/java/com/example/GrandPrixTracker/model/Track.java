package com.example.GrandPrixTracker.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    @Column
    private Double lengthInKm;

    @Column
    private Integer turns;

    @Column
    private String abbreviation;

    @OneToMany
    private List<Race> races;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getLengthInKm() {
        return lengthInKm;
    }

    public void setLengthInKm(Double lengthInKm) {
        this.lengthInKm = lengthInKm;
    }

    public Integer getTurns() {
        return turns;
    }

    public void setTurns(Integer turns) {
        this.turns = turns;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public List<Race> getRaces() {
        return races;
    }

    public void setRaces(List<Race> races) {
        this.races = races;
    }
}
