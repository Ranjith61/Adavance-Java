package com.array.xworkz;

public class Corporator {
public String corpName;
	
	Building building=new Building("Shanti nilaya","Kuvempu Nagara",3);
	Building building1=new Building("Shrinidhi pg for boys","rajajiNagar",34);
	public Building[] buildings={building,building1};

	public Corporator(String corpName) {
		this.corpName = corpName;
	}

	public void printInfo() {
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Corporator name is "+this.corpName);
		for(int i=0;i<buildings.length;i++)
		{
			Building building=buildings[i];
			building.printInfo();
		}

	}

}


