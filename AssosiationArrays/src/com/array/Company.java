package com.array;

public class Company {
	public String name;
	public String ceo;
	public int originCountry;
	
	public Company(String name,String ceo,int originCountry)
	{
		System.out.println("Running the company information");
		this.name=name;
		this.ceo=ceo;
		this.originCountry=originCountry;
		
	}
	public void printinfo()
	{
		System.out.println("Name of the company="+this.name);
		System.out.println("CEO of the company="+this.ceo);
		System.out.println("The origin of the country="+this.originCountry);

	}
}



