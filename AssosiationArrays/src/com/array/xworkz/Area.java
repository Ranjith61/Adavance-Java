package com.array.xworkz;

public class Area {
	public String name;
	public Corporator corporator=new Corporator("Rakesh");
	public Area(String name)
	{
		System.out.println("Invoking string constructor in Area");
		this.name=name;
	}
	public void printInfo() {
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Name of the area is "+this.name);
		corporator.printInfo();
		
	}
	

}
