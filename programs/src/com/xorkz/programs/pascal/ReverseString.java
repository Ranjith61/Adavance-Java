package com.xorkz.programs.pascal;


public class ReverseString {
	public static void main(String[] args) {
		String s = "java";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}

}
