package com.xworkz.validatedto.DTO;

import java.io.Serializable;

public class WasteDTO implements Serializable {
	private String name;
	private String type;
	private double weight;
	
	public WasteDTO(String name, String type, double weight) {
		super();
		this.name = name;
		this.type = type;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "WasteDTO [name=" + name + ", type=" + type + ", weight=" + weight + "]";
	}
	
	

	
}
