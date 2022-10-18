package com.aashutosh.dishInfoService.models;

public class Dish {
    private String name;
    private String cuisine;
    private String dishType;

    public Dish(String name, String cuisine, String dishType) {
        this.name = name;
        this.cuisine = cuisine;
        this.dishType = dishType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }
}
