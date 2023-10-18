package com.array.xworkz;

public class Building {
	public String buildName;
	public String location;
	public int noOfCross;
	
	Floor floor1=new Floor("First",101);
	Floor floor2=new Floor("Second",201);
	public Floor[] floor={floor1,floor2};
	
	Lift lift1=new Lift("A");
	Lift lift2=new Lift("B");
	public Lift[] lift={lift1,lift2};
	
	
	public Building(String buildName,String location,int noOfCross)
	{
		System.out.println("Invoking constructor in Building");
		this.buildName=buildName;
		this.location=location;
		this.noOfCross=noOfCross;
	}


	public void printInfo() {
		System.out.println("------------------------------------------");
		System.out.println("building name is "+this.buildName);
		System.out.println("Location of the building is "+this.location);
		System.out.println("No of cross building is located :"+this.noOfCross);
		for(int i=0;i<floor.length;i++)
		{
			Floor floors=floor[i];
			floors.printInfo();
		}
		
		for(int i=0;i<lift.length;i++)
		{
			Lift lifts=lift[i];
			lifts.printInfo();
		}
	}
	
	
}

