package com.watchman;

public class Watchman {
	public Gun gun=new Gun();
	
	void secure()
	{
		System.out.println("invoking gun in watchman");
		gun.shoot();
	}

}
