package com.springBootAutoWireDependencyInjection;

import org.springframework.stereotype.Component;

@Component("lap1") // By default the object name is Laptop itself but we can change it by providing name in component annotation
public class Laptop 
{
	
	private int lid;
	private String brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	//creating my own method
	public void compile()
	{
		
		System.out.println("Compiling");
	}
	

}
