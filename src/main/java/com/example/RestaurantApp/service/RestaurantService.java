package com.example.RestaurantApp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.RestaurantApp.model.RestaurantModel;
@Service
public class RestaurantService implements RestaurantServiceImp {
	private static List<RestaurantModel> restaurantModels =new ArrayList<>();
	
	static {
		restaurantModels.add(new RestaurantModel(1214,"wicked food","Nagpur","551","south food",10));
		restaurantModels.add(new RestaurantModel(2,"slice restro","mumbai","991","chinese",15));
		restaurantModels.add(new RestaurantModel(3,"haldiram","delhi","442","non-veg",8));
		restaurantModels.add(new RestaurantModel(4,"food vilage","pune","312","misalPav",18));
    }


	public List<RestaurantModel> findAll() {
	
		return restaurantModels;
	}
	
	@Override
    public RestaurantModel getRest(String restaurantName) {
		RestaurantModel r1 =null;
		for(RestaurantModel rest:restaurantModels) {
			if(rest.getRestaurantName().equals(restaurantName)) {
				r1=rest;
				break;
			}
		}
		return r1;
	}

	
	
	public void addRestaurantModel(RestaurantModel restaurantModel) {
		restaurantModels.add(restaurantModel);
	}

}
