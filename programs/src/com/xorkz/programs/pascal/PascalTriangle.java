package com.xorkz.programs.pascal;

public class PascalTriangle {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {  //rows i=1
		
			//spaces
			for(int j=1;j<5-i;j++) {
				System.out.print(" ");
			}
			
			//number
			int number =1;
			for(int k=0;k<=i;k++) {//k=0 k=0<=i=0(1)
				//k=0 ,k=0<=i=1(1) k=1,k=1<=i=1 (1)
				System.out.print(number+" ");
				number = number * (i-k)/(k+1);
			}
			
			System.out.println();
			
		}
		
//		int n = 4;
//		System.out.println("--patterns using right angle triangle--");
//		for (int row = 1; row <= n; row++) {
//			for (int col = 1; col <= row; col++) {
//				System.out.print(col + " ");
//			}
//			System.out.println();
//		}
	}

}
