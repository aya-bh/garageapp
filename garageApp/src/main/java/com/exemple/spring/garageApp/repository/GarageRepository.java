package com.exemple.spring.garageApp.repository;

import com.exemple.spring.garageApp.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageRepository extends CrudRepository<Car, Long> {
}
