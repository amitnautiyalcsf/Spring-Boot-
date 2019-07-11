package com.springBootPrototypeAutoWireDependencyInjection;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Student 
{
	private int sid;
	private String sname;
	private String tech;
	
	
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
	
	public void show()
	{
		System.out.println("Executing");
	}
	
	
	

}
