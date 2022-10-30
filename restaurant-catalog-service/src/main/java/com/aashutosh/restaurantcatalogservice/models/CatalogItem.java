package com.aashutosh.restaurantcatalogservice.models;

import java.util.List;

public class CatalogItem {

    private RestaurantInfo restaurantInfo;
//    String restoName;
//    String city;
    List<Dish> dishes;

    public CatalogItem(RestaurantInfo restaurantInfo, List<Dish> dishes) {
        this.restaurantInfo = restaurantInfo;
        this.dishes = dishes;
    }

    public RestaurantInfo getRestaurantInfo() {
        return restaurantInfo;
    }

    public void setRestaurantInfo(RestaurantInfo restaurantInfo) {
        this.restaurantInfo = restaurantInfo;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
