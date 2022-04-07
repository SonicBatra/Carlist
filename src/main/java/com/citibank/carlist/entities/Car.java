package com.citibank.carlist.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carID;
	private String carName;
	private int engineCC;
	private String transmission;
	private int seatingcapacity;
	private int ncapRating;
	private String color;
	
	public Car() {
		super();
	
	}

	public Car(int carID, String carName, int engineCC, String transmission, int seatingcapacity, int ncapRating,
			String color) {
		super();
		this.carID = carID;
		this.carName = carName;
		this.engineCC = engineCC;
		this.transmission = transmission;
		this.seatingcapacity = seatingcapacity;
		this.ncapRating = ncapRating;
		this.color = color;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public int getSeatingcapacity() {
		return seatingcapacity;
	}

	public void setSeatingcapacity(int seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}

	public int getNcapRating() {
		return ncapRating;
	}

	public void setNcapRating(int ncapRating) {
		this.ncapRating = ncapRating;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car {" + "carID=" + carID + ", carName=" + carName + ", engineCC=" + engineCC + ", transmission="
				+ transmission + ", seatingcapacity=" + seatingcapacity + ", ncapRating=" + ncapRating + ", color="
				+ color + "}";
	}
	
	
	
}
