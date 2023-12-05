package com.xorkz.programs.pascal;

public class StringRotation {

//    public static boolean isRotation(String str1, String str2) {
//	        // Check if lengths are equal and not empty
//	        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
//	            return false;
//	        }
//
//	        // Concatenate str1 with itself, then check if str2 is a substring of the concatenated string
//	        String concatenated = str1 + str1;
//	        return concatenated.contains(str2);
//	    }
//
//	    public static void main(String[] args) {
//	        // Example usage
//	        String s1 = "waterbottle";
//	        String s2 = "erbottlewat";
//
//	        if (isRotation(s1, s2)) {
//	            System.out.println(s2 + " is a rotation of " + s1);
//	        } else {
//	            System.out.println(s2 + " is not a rotation of " + s1);
//	        }
//	    }

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAB";

		if (s1.length() != s2.length()) {
//		System.out.println("is a rotation");
//	}else {
			System.err.println(" not a rotation");
			System.exit(0);
		}

		String s3 = s1 + s1;
		if (s3.indexOf(s2) != -1) {
			System.out.println(s2 + " is a rotation of " + s1);
		} else {
			System.out.println(s2 + " is not a rotation of " + s1);
		}

	}
}
