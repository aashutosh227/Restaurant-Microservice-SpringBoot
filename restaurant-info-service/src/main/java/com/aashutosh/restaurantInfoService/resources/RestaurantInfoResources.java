package com.aashutosh.restaurantInfoService.resources;

import com.aashutosh.restaurantInfoService.models.RestaurantInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/restaurantInfo")
public class RestaurantInfoResources {
    @GetMapping("")
    public List<RestaurantInfo> getAllRestInfo(){
        ArrayList<RestaurantInfo> restaurants = new ArrayList<>();
        restaurants.add(new RestaurantInfo("Legacy", "Mumbai"));
        restaurants.add(new RestaurantInfo("Delhi Darbar", "Delhi"));
        return restaurants;
    }
}
