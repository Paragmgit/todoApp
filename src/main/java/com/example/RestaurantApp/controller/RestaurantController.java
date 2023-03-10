package com.example.RestaurantApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestaurantApp.model.RestaurantModel;
import com.example.RestaurantApp.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
    private RestaurantService service;
	
	@PostMapping("/add-restaurant")
	public void addRestaurantModel(@RequestBody RestaurantModel restaurantModel) {
		service.addRestaurantModel(restaurantModel);
	}
	
	@GetMapping("find-all")
	public List<RestaurantModel> findAllRestaurantModels(){
		return service.findAll();
	}
	
	@GetMapping("restaurantName/{restaurantName}")
	public RestaurantModel getRest(@PathVariable String restaurantName) {
		return service.getRest(restaurantName);
	}
}
