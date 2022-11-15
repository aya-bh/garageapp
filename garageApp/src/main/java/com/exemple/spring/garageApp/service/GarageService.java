package com.exemple.spring.garageApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.exemple.spring.garageApp.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.spring.garageApp.model.Car;

@Service
public class GarageService {

	@Autowired
	public GarageRepository garageRepository;
/*	static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
			new Car(1,"ex1","ex1",2002,Car.Color.BROWN),
			new Car(2,"ex2","ex2",2002,Car.Color.GREEN),
			new Car(3,"ex3","ex3",2002,Car.Color.BLUE),
			new Car(4,"ex4","ex4",2002,Car.Color.RED),
			new Car(5,"ex5","ex5",2002,Car.Color.YELLOW),
			new Car(6,"ex6","ex6",2002,Car.Color.BROWN),
			new Car(7,"ex7","ex7",2002,Car.Color.YELLOW),
			new Car(8,"ex8","ex8",2002,Car.Color.GREEN)
			));*/
	
	public List<Car> getCars(){
		List<Car> cars = new ArrayList<>();
		garageRepository.findAll().forEach(car -> {
			cars.add(car);
		});
		return cars;
		}
	
	public Car getCar(long id) {
		//return getCars().stream().filter(car -> car.getId() == id).findFirst().orElse(null);
		return garageRepository.findById(id).orElse(null);
	}
	
	public void deleteCar(long id) {
		//getCars().removeIf(car -> car.getId() == id);
		garageRepository.deleteById(id);
	}
	
	public void addCar(Car car) {
		//getCars().add(car);
		garageRepository.save(car);
	}
	
	public void updateCar(Car car, long id) {
		/*getCars().forEach(car1 -> {
			if(car1.getId() == id) {
				cars.set(cars.indexOf(car1), car);
			}
		});*/
		garageRepository.save(car);
		
	}
}
