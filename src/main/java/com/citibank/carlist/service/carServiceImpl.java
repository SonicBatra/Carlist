package com.citibank.carlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.citibank.carlist.entities.Car;
import com.citibank.carlist.repository.carRepository;

public class carServiceImpl implements carService{
	
	List<Car> list;
	
	@Autowired
	private carRepository carrepository;
	
	@Override
	public List<Car> savecarList(Car car) {
		
		return carrepository.savecarList(car);
	}

	@Override
	public List<Car> getCar() {
	
		return carrepository.getCar();
	}

	@Override
	public List<Car> getCarId(Long carId) {
		
		return carrepository.getCarId();
	}

	@Override
	public List<Car> deleteCarId(Long carId) {
		
		return carrepository.deleteCarId();
	}

	@Override
	public List<Car> updateCarId(Long carId, Car car) {
		
		return carrepository.updateCarId();
	}

}
