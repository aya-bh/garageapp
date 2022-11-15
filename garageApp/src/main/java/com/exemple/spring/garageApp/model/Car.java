package com.exemple.spring.garageApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	public enum Color {
		RED,
		YELLOW,
		BROWN,
		BLUE,
		GREEN
	}
	@Id
	private long id;
	private String model;
	private String brand;
	@Column(name = "released_year")
	private int year;
	private Color color;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Car(long id, String model, String brand, int year, Color color) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.color = color;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Car() {
		
	}
	
	
}
