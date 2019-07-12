package com.bruno.apigraphql.apigraphql.service;

import com.bruno.apigraphql.apigraphql.model.Restaurant;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private RestaurantService restaurantService;

    public List<Restaurant> findAllRestaurants(){
        return restaurantService.list();
    }

}
