package com.xorkz.programs.pascal;

public class Initial {

	public static void main(String[] args) {
		String name = "Mohammed Ismail";
		String[] names = name.split(" ");
		String ini = " ";
		
		for (String string : names) {
			ini = ini + string.charAt(0);			
		}		
		System.out.println(ini);
	}
}
