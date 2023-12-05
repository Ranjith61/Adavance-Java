package com.xorkz.programs.pascal;

public class Likes {

	public static String likesBy(String[] names) {
		if(names.length==0) {
			return "no one likes this";
		}else if(names.length==1){
			return names[0] + " likes this";
		}else if(names.length==2) {
			return names[0]+ " and " + names[1] + " liked this";
		}else {
			return names[0]+" , "+names[1]+ " and " + (names.length-2)+" others also like this";
		}
	}
	
	public static void main(String[] args) {

		System.out.println("[]-->" +likesBy(new String[] {}));
		System.out.println(likesBy(new String[] {"Peter"}));
		System.out.println(likesBy(new String[] {"Jacob","Alex"}));
		System.out.println(likesBy(new String[] {"Max","John","Mark"}));
		System.out.println(likesBy(new String[] {"Alex","Jacob","Mark","Max"}));
		System.out.println(likesBy(new String[] {"Alex"}));
		
	}

}
