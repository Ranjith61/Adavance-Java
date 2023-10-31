package loopingStatements;
//Java program to print even numbers from 1 to 10
public class Even {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even numbers from 1 to 10 is : "+i);
			}
		}
		
//java programs to print odd numbers from 1 to 10
		System.out.println("--------");
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("odd numbers from 1 to 10 is :" +i);
			}
		}
		
//Java programs to print multiples of 3 from 1 to 15
		System.out.println("==========");
		for(int  i=1;i<=15;i++) {
			if(i%3==0) {
				System.out.println("multiples of 3 from 1 to 15 :" +i);
			}
		}
		System.out.println("===========");
		for(int i=1;i<=10;i++) 
		{
			System.out.println(i);
		}
	}

}
