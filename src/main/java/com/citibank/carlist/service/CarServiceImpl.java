package com.citibank.carlist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.citibank.carlist.entities.Car;
import com.citibank.carlist.repository.CarRepository;

public class CarServiceImpl implements CarService{
	//return "Car {" + "carID=" + carID + ", carName=" + carName + ", engineCC=" + engineCC + ", transmission="
	//		+ transmission + ", seatingcapacity=" + seatingcapacity + ", ncapRating=" + ncapRating + ", color="
	//		+ color + "}";
	
	
	
	List<Car> list;
	
	public CarServiceImpl(){
		list = new ArrayList<>();
		list.add(new Car( 1, "Maruti", 1000, "Automatic", 5, 4, "White"));
		list.add(new Car( 2, "Honda", 1000, "Automatic", 5, 4, "Grey"));
		list.add(new Car( 3, "Tata", 1000, "Manual", 5, 4, "Brown"));
		list.add(new Car( 4, "Mahindra", 1000, "Manual", 5, 4, "Silver"));
	}
	
	@Autowired
	private CarRepository carrepository;
	
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
