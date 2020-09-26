package com.bridgelabz.linesComparision;

public class LinesComparision {
	
	public void compareTo(Double lineOne, Double lineTwo)
	{
		//Comparison of two lines using Java compareTo method
		int comparedValue = lineOne.compareTo(lineTwo);
		if(comparedValue>0)
			System.out.println("The length of the line one is greater than length of line two");
		else if(comparedValue<0)
			System.out.println("The length of the line one is less than length of line two");
	}
	public void equals(Double lineOne, Double lineTwo)
	{
		//Checking of equality of two lines using Java equals method
		boolean areEqual = lineOne.equals(lineTwo);
		if(areEqual)
			System.out.println("The length of the two lines are equal");
		else 
			System.out.println("The length of the two lines are not equal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int lineOneX1,lineOneX2,lineOneY1,lineOneY2,lineTwoX1,lineTwoX2,lineTwoY1,lineTwoY2;
		int xCoorDiff, yCoorDiff;
				
	    //Welcome message
		System.out.println("Welcome to Line Comparison Computation Program");
				
		//Generating coordinate points using random
		lineOneX1 = (int)(Math.floor(Math.random()*10));
		lineOneX2 = (int)(Math.floor(Math.random()*10));
		lineOneY1 = (int)(Math.floor(Math.random()*10));
		lineOneY2 = (int)(Math.floor(Math.random()*10));
		lineTwoX1 = (int)(Math.floor(Math.random()*10));
		lineTwoX2 = (int)(Math.floor(Math.random()*10));
		lineTwoY1 = (int)(Math.floor(Math.random()*10));
		lineTwoY2 = (int)(Math.floor(Math.random()*10));
				
		//Computation length of the line
		xCoorDiff = lineOneX1-lineOneX2;
		yCoorDiff = lineOneY1-lineOneY2;
		Double lineOneLength = Math.sqrt((Math.pow(xCoorDiff,2))+(Math.pow(yCoorDiff,2)));
		System.out.println("Length of Line One "+lineOneLength+" units");
		xCoorDiff = lineTwoX1-lineTwoX2;
		yCoorDiff = lineTwoY1-lineTwoY2;
		Double lineTwoLength = Math.sqrt((Math.pow(xCoorDiff,2))+(Math.pow(yCoorDiff,2)));
		System.out.println("Length of Line Two "+lineTwoLength+" units");
		
		//Comparison of lines
		LinesComparision object = new LinesComparision();
		object.equals(lineOneLength,lineTwoLength);
		object.compareTo(lineOneLength,lineTwoLength);
		
		

		
	
	}

}
