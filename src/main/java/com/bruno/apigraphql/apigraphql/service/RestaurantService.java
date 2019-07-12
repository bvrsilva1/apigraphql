package com.bruno.apigraphql.apigraphql.service;

import com.bruno.apigraphql.apigraphql.model.Restaurant;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantService {

    private List<Restaurant> restaurants = new ArrayList<Restaurant>();

     {

        Restaurant r1 = new Restaurant();
        r1.setCity("Lincoln").setId(1).setName("Rodizio Grill").setRate("B").setState("NE");

        Restaurant r2 = new Restaurant();
        r2.setCity("Kansas City").setState("MO").setId(2).setName("Brazilian Grill").setRate("A-").setDescription("Best brazilian restaurant in KC!");

        Restaurant r3 = new Restaurant();
        r3.setCity("New York").setState("NY").setId(3).setName("Ellen's Stardust Diner").setRate("A+").setDescription("collest restaurant in town");

        Restaurant r4 = new Restaurant();
        r4.setState("NE").setId(4).setName("Raising Cane's Chicken Fingers").setRate("A").setDescription("so good!");

        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4);

    }

    public List<Restaurant> list(){
         return restaurants;
    }

    public Restaurant get(Integer id){
         for(Restaurant restaurant : restaurants){
             if(restaurant.getId() == id)
                 return restaurant;
         }

         return null;
    }

    public Restaurant get(String name){
        for(Restaurant restaurant : restaurants){
            if(name.equals(restaurant.getName()))
                return restaurant;
        }

        return null;
    }

    public List<Restaurant> getByState(String state){
         List<Restaurant> restaurantState = new ArrayList<>();

        for(Restaurant restaurant : restaurants){
            if(state.equals(restaurant.getState()))
                restaurantState.add(restaurant);
        }

        return restaurantState;
    }

}
