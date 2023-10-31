package loopingStatements;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
		int n=1;
		while(n<=5) {
			System.out.println(n);
			n++;
		}
		
		
		System.out.println("-----DO WHILE LOOP------");
		int x=1;
		do {
			System.out.println(x);
			x++;
		}
		while(x<=5);	
		
		
		System.out.println("*****REVESE THE NUMBER USING WHILE LOPP****");
		// 5 4 3 2 1
		int y=5;
		while(y>=1) {
			System.out.println(y);
			y--;
		}
		

		System.out.println("*****REVESE THE NUMBER USING DO WHILE LOPP****");
		// 5 4 3 2 1
		int r=5;
		do {
			System.out.println(r);
			r--;
		}
		while(r>=1);
		
		System.out.println("Even number in reverse");
		int s=10;
		while(s>=2) {
			System.out.println(s);
		 s-=2;
		}
		
		System.out.println("Even number in reverse using do while loop");

		int a=10;
		do {
			System.out.println(a);
			a-=2;
		}
		while(a>=2);
		
	}
	

}
