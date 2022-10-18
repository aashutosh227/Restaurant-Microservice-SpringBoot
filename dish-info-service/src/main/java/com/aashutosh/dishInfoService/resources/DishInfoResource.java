package com.aashutosh.dishInfoService.resources;

import com.aashutosh.dishInfoService.models.Dish;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/dishes")
public class DishInfoResource {
    HashMap<Integer, Dish> dishMap = new HashMap<Integer, Dish>();

    public DishInfoResource() {
        dishMap.put(1, new Dish("Masala Dosa","South Indian","Breakfast"));
        dishMap.put(2, new Dish("Butter Chicken","North Indian","Meal"));
        dishMap.put(3, new Dish("Pizza","Western","Meal"));
        dishMap.put(4, new Dish("Pav Bhaji","North Indian","Meal"));
        dishMap.put(5, new Dish("Dhokla","Gujrati","Meal"));
    }

    @GetMapping("/{id}")
    public Dish getAllDishes(@PathVariable int id){
        return dishMap.get(id);
    }
}
