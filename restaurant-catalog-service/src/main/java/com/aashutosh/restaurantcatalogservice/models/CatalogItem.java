package com.aashutosh.restaurantcatalogservice.models;

import java.util.List;

public class CatalogItem {

    String restoName;
    String city;
    List<Dish> dishes;

    public CatalogItem(String restoName, String city, List<Dish> dishes) {
        this.restoName = restoName;
        this.city = city;
        this.dishes = dishes;
    }

    public String getRestoName() {
        return restoName;
    }

    public void setRestoName(String restoName) {
        this.restoName = restoName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
