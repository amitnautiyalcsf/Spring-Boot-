package com.springBootAutoWireDependencyInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Student 
{
	private int sid;
	private String sname;
	private String tech;
	
	@Autowired // By default autowire searches by type
	@Qualifier("lap1") // By default searches by name
	private Laptop lap;
	
	
	
	
	public Student() {
	
		System.out.println("Object created");
	}
	
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	
	public Laptop getLap() {
		return lap;
	}



	public void setLap(Laptop lap) {
		this.lap = lap;
	}



	public void show()
	{
		System.out.println("Executing");
		lap.compile();
		
		
		
	}
	
	
	

}
