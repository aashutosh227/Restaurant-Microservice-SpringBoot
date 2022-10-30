package com.aashutosh.restaurantInfoService.resources;

import com.aashutosh.restaurantInfoService.models.RestaurantInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurantInfo")
public class RestaurantInfoResources {
    @GetMapping("/{id}")
    public RestaurantInfo getRestInfoById(@PathVariable int id){
        return new RestaurantInfo(id, "Legacy", "Mumbai");
    }
}
