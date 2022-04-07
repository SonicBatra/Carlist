package com.citibank.carlist.service;

import java.util.List;

import com.citibank.carlist.entities.Car;

public interface CarService {

	public List<Car> savecarList(Car car);

	public List<Car> getCar();

	public List<Car> getCarId(Long carId);

	public List<Car> deleteCarId(Long carId);

	public List<Car> updateCarId(Long carId, Car car);
	
}
