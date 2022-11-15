package com.exemple.spring.garageApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.exemple.spring.garageApp.model.Car;
import com.exemple.spring.garageApp.service.GarageService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class GarageController {
	//autowired pour injecter de dependence (injecter garageservice creer)
	@Autowired
	private GarageService garageService;
	
	@RequestMapping(method = RequestMethod.GET, value="/cars")
	public List<Car> getCars() {
		//Car mycar = new Car("Laguna","Renault",2004, Car.Color.RED);
		return garageService.getCars();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/car/{id}")
	public Car getCar(@PathVariable long id) {
		return garageService.getCar(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/car/{id}")
	public void deleteCar(@PathVariable long id) {
		garageService.deleteCar(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/cars")
	public void addCar(@RequestBody Car car) {
		garageService.addCar(car);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/car/{id}")
	public void updateCar(@RequestBody Car car,@PathVariable long id) {
		garageService.updateCar(car, id);
	}
}
