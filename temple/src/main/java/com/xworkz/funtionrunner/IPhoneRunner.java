package com.xworkz.funtionrunner;

import com.xworkz.function.IPhone;

public class IPhoneRunner {
	public static void main(String[] args) {
		IPhone iPhone = ()->{
			System.out.println("invoking iphone in iphoneRunner , Lambda Expression");
			return true;
		};
		
		run(iPhone);
			
	
	}	
		static void run(IPhone iPhone) {
			boolean yes = iPhone.looksGood();
			System.out.println("Iphone looks good = "+yes);
		}


}
