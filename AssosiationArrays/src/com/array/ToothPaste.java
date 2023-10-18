package com.array;

public class ToothPaste {
	public String name;
	public String brand;
	public Company b=new Company("colgate","wallace",1873);
	public Ingredients[] ingredients;

	public ToothPaste(String name,String brand,Ingredients[] ingredients)
	{
		this.name=name;
		this.brand=brand;
		this.ingredients=ingredients;
	}
	public void printinfo()
	{
		System.out.println("The name of the toothpaste="+this.name);
		System.out.println("The brand of the company is="+this.brand);
		for(int i=0;i<ingredients.length;i++)
			{
			Ingredients ref=ingredients[i];
			ref.printinfo();
			}
			b.printinfo();
			}
	}

