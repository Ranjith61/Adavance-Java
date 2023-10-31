package loopingStatements;
//it is used for solving pattern problems
//outer for loop is rows
//inner for loop is columns
//STEPS 1 : NO OF LINES = NP OF ROWS =NO OF TIMES OUTER FOR LOOP WILL RUN
//STEPS 2 : IDENTIFY EVERY ROW NO , HOW MANY COLMN ARE THERE,TYPE OF ELEMNT IN COLUMN 
//STEPS 3 : PRINT THE NEXT LINE OR WHAT DO YOY NEED TO PRINT

public class NestedForLoop {
	public static void main(String[] args) 
	{
	for(int i=1; i<=3; i++)	
	{
		for(int j=5; j<=6; j++)
		{
			System.out.println("i: "+i + " j:"+j);
		}
		System.out.println("------------");
	}
	
	System.out.println("To the patterns ***");
	for(int i=1; i<=5; i++)
{
	for(int j=1; j<=5; j++) 
	{
		System.out.print("* ");
	}
	System.out.println();
	}
	
	
	}

}
