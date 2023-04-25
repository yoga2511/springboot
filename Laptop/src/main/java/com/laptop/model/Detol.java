package com.laptop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Detol {
	@Id
	private int batno;
	private String manarea;
	private int cost;
	private String clr;
	private String size;
	private String flavor;
	private String quantity;
	private String type;
	public String getClr() {
		return clr;
	}
	public void setClr(String clr) {
		this.clr = clr;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBatno() {
		return batno;
	}
	public void setBatno(int batno) {
		this.batno = batno;
	}
	public String getManarea() {
		return manarea;
	}
	public void setManarea(String manarea) {
		this.manarea = manarea;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

}
