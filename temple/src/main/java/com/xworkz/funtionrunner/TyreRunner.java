package com.xworkz.funtionrunner;

import com.xworkz.function.Tyre;

public class TyreRunner {
	public static void main(String[] args) {
		Tyre tyre = (brand, size, type) -> {
			if (brand.equals("MRF") && size == 12 && type.equals("two")) {
				return 20;
			}
			if (brand.equals("Ceat") && size == 15 && type.equals("three")) {
				return 55;
			}
			if (brand.equals("appolo") && size == 19 && type.equals("four")) {
				return 96;

			}
			return 0;
		};
		gun(tyre, "MRF", 12, "two");
		gun(tyre, "Ceat", 15, "two");
		gun(tyre, "appolo", 19, "two");

	}

	static void gun(Tyre tyre, String brand, int size, String type) {
		double val = tyre.getPrice(brand, size, type);
		System.out.println("getPrice :" + val);
	}
}
