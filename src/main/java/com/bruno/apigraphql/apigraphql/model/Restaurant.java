package com.bruno.apigraphql.apigraphql.model;


public class Restaurant {

    private Integer id;
    private String name;
    private String city;
    private String state;
    private String rate;
    private String description;

    public Restaurant setId(Integer id) {
        this.id = id;
        return this;
    }

    public Restaurant setName(String name) {
        this.name = name;
        return this;
    }

    public Restaurant setCity(String city) {
        this.city = city;
        return this;
    }

    public Restaurant setState(String state) {
        this.state = state;
        return this;
    }

    public Restaurant setRate(String rate) {
        this.rate = rate;
        return this;
    }

    public Restaurant setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getRate() {
        return rate;
    }

    public String getDescription() {
        return description;
    }
}
