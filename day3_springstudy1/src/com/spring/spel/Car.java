package com.spring.spel;

public class Car {
	private String brand;
	private double price;
	//轮胎的周长
	private double tyrePerimter;
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

	public Car() {
		System.out.println("car's Constructor...");
	}
	public double getTyrePerimter() {
		return tyrePerimter;
	}
	public void setTyrePerimter(double tyrePerimter) {
		this.tyrePerimter = tyrePerimter;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyrePerimter=" + tyrePerimter + "]";
	}
	
	
}
