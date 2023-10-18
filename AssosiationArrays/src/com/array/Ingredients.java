package com.array;

public class Ingredients {
	public String name;
	public int quality;
	public int cost;
	Ingredients(String name,int quality,int cost)
	{
		this.name=name;
		this.quality=quality;
		this.cost=cost;
	}
	public void printinfo()
	{
		System.out.println("Name of the ingredients="+name);
		System.out.println("Name of the ingredients="+quality);
		System.out.println("Name of the ingredients="+cost);
		System.out.println("_________________");
	}
	}


