package com.bruno.apigraphql.apigraphql.controller;

import com.bruno.apigraphql.apigraphql.model.Restaurant;
import com.bruno.apigraphql.apigraphql.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/")
    public List<Restaurant> list(){
        return restaurantService.list();
    }

    @GetMapping("/name/{name}")
    public Restaurant getByName(@PathVariable String name){
        return restaurantService.get(name);
    }

    @GetMapping("/state/{state}")
    public List<Restaurant> getByState(@PathVariable String state){
        return restaurantService.getByState(state);
    }

    @GetMapping("/{id}")
    public Restaurant getById(@PathVariable Integer id){
        return restaurantService.get(id);
    }

}
