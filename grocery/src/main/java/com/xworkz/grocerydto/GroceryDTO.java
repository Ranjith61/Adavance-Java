package com.xworkz.grocerydto;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter//lombok
@Setter
@NoArgsConstructor
@ToString

public class GroceryDTO implements Serializable{

	
	private String name;
	private double price;
	private String type;
	private double quantity;
	
	public GroceryDTO(String name, double price, String type, double quantity) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "GroceryDTO [name=" + name + ", price=" + price + ", type=" + type + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
