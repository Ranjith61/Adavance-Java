package com.xworkz.funtionrunner;

import com.xworkz.function.NewsPaper;

public class FunctionRunner {
	public static void main(String[] args) {

		NewsPaper newspaper = (agency) -> {
			if (agency.equals("TOI")) {
				return 2;

			} else if (agency.equals("DH")) {
				return 3;

			} else if (agency.equals("HT")) {
				return 5;

			}
			return 7;

		};

		call(newspaper, "TOI");
		call(newspaper, "DH");
		call(newspaper, "HT");

	}

	static void call(NewsPaper newsPaper, String agency) {
		double val = newsPaper.priceByAgency(agency);
		System.out.println("priceByAgency is :" + val);

	}

}
