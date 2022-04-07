package com.citibank.carlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citibank.carlist.entities.Car;


@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

	public Car save(Car car);

	public List<Car> savecarList(Car car);

	public List<Car> getCar();

	public List<Car> getCarId();

	public List<Car> deleteCarId();

	public List<Car> updateCarId();
	
}
