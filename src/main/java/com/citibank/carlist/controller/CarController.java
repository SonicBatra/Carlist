package com.citibank.carlist.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.carlist.entities.Car;
import com.citibank.carlist.service.CarService;

import com.citibank.carlist.controller.CarController;

@RestController
public class CarController {

	
	private final Logger LOGGER = LoggerFactory.getLogger(CarController.class);
	
	@Autowired
	private CarService carservice;
	
	
	@PostMapping("/carList")
	public List<Car> savecarlist(@RequestBody Car car){
	LOGGER.info("Saving Car records");	
	return carservice.savecarList(car);
	}
	
	@GetMapping("/carList")
	public List<Car> getCar()
	{
		LOGGER.info("Getting Car record");
		return this.carservice.getCar();
	}
	
	@GetMapping("/carList/{Id}")
	public List<Car> getCarId(@PathVariable("Id") Long carId)
	{
		LOGGER.info("Getting Car record via Id");
		return this.carservice.getCarId(carId);
	}
	
	@DeleteMapping("/carList")
	public List<Car> deleteCarId(@PathVariable("Id") Long carId)
	{
		LOGGER.info("Delete Car record via Id");
		return this.carservice.deleteCarId(carId);
	}
	
	@PutMapping("/carList/{Id}")
	public List<Car> updateCarId(@PathVariable("Id") Long carId, 
			@RequestBody Car car)
	{
		LOGGER.info("Update the Car record");
		return this.carservice.updateCarId(carId,car);
	}
	
}