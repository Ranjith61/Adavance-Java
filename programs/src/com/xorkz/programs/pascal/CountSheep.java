package com.xorkz.programs.pascal;

public class CountSheep {

	public static void main(String[] args) {

		Boolean[] sheep = { true, false, null, true, false, null, false};
		sheepCount(sheep);

	}

	static void sheepCount(Boolean[] sheep) {

		int attend = 0;
		int absent = 0;
		for (int i = 0; i < sheep.length; i++) {
			if (sheep[i] != null) {
				if (sheep[i] == true) {
					attend++;

				} else if (sheep[i] == false) {
					absent++;
				}
			}

		}

		System.out.println("Sheep present are " + attend);
		System.out.println("Sheep Absent are " + absent);

	}
}
