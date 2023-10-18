package com.array;

public class ToothRunner {
	public static void main(String[] args)
	{
		Ingredients p=new Ingredients("sugar",5,259);
		Ingredients p1=new Ingredients("Glycerin",4,120);
		Ingredients p3=new Ingredients("Fluoride",3,100);
		Ingredients p4=new Ingredients("silica",2,50);
		Ingredients p5=new Ingredients("sucralose",1,10);
		
		Ingredients[] madhura= {p,p1,p3,p4,p5};
		ToothPaste w=new ToothPaste("colgate","colgate",madhura);
		w.printinfo();
		
	}

}
