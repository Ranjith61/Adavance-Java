package loopingStatements;

//it is used for solving pattern problems
//outer for loop is rows
//inner for loop is columns
//STEPS 1 : NO OF LINES = NP OF ROWS =NO OF TIMES OUTER FOR LOOP WILL RUN
//STEPS 2 : IDENTIFY EVERY ROW NO , HOW MANY COLMN ARE THERE,TYPE OF ELEMNT IN COLUMN 
//STEPS 3 : PRINT THE NEXT LINE OR WHAT DO YOU NEED TO PRINT
public class PatternProblems {
	public static void main(String[] args) {
		pattern1(4);
		pattern2(4);
		pattern3(4);
		pattern4(5);
	}

	static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {
			// for every row we need column
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			// for every row printed we need to add new line
			System.out.println();
		}
		System.out.println("----------------------");
	}

	static void pattern2(int n) {
		for (int row = 1; row <= n; row++) {
			// for every row we need column
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			// for every row printed we need to add new line
			System.out.println();
		}
		System.out.println("----------------");
	}

	static void pattern3(int n) {

		for (int row = 1 ; row <= n; row++) {
			for (int col = 1; col <= n-row+1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------------");
	}
	
	static void pattern4(int n) {
		System.out.println("--pattern4--");
		for(int row = 1; row<=n; row++ ) {
			for(int col =1; col<=row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
