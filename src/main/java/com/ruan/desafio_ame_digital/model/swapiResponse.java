package com.ruan.desafio_ame_digital.model;

import java.util.Date;
import java.util.List;

public class swapiResponse {

    private String name;
    private Integer rotation_period;
    private Integer orbital_period;
    private Integer diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private Integer surface_water;
    private float population;
    private List<String> residents;
    private List<String> films;
    private Date created;
    private Date edited;
    private String url;

    public swapiResponse(String name, Integer rotation_period, Integer orbital_period, Integer diameter, String climate, String gravity, String terrain, Integer surface_water, float population, List<String> residents, List<String> films, Date created, Date edited, String url) {
        this.name = name;
        this.rotation_period = rotation_period;
        this.orbital_period = orbital_period;
        this.diameter = diameter;
        this.climate = climate;
        this.gravity = gravity;
        this.terrain = terrain;
        this.surface_water = surface_water;
        this.population = population;
        this.residents = residents;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public swapiResponse() {
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }
}
