package com.example.mobiledemo.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="demo")

public class mobiledemo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int sno;
    private String brand;
   
    private String model;
    private String ram;
    private String rom;
  
    private int price;
	mobiledemo(){}
	public int getsno() {
		return sno;
	}
	public void setsno(int sno) {
		this.sno = sno;
	}
	public String getbrand() {
		return brand;
	}
	
	public void setbrand(String brand) {
		this.brand = brand;
	}
	
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public String getram() {
		return ram;
	}
	public void setram(String ram) {
		this.ram = ram;
	}
	public String getrom() {
		return rom;
	}
	public void setrom(String rom) {
		this.rom = rom;
	}
	
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	
	
	
}
