package com.jspider.cardekho.entity;

public class Car {
   
   
	   private int id;
	   private String name;
	   private String model;
	   private String brand;
	   private double price;
	   private String color;
	   private String fuelType;
	   
	   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model + ", brand=" + brand + ", price=" + price
				+ ", color=" + color + ", fuelType=" + fuelType + "]";
	}
	
	   
	   
	   
	   
	   
	   
	   
   

}
