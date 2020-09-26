package com.bridgelabz.linesComparision;

public class LinesComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int lineX1,lineX2,lineY1,lineY2;
	    int xCoorDiff, yCoorDiff;
				
	    //Welcome message
		System.out.println("Welcome to Line Comparison Computation Program");
				
		//Generating coordinate points using random
		lineX1 = (int)(Math.floor(Math.random()*10));
		lineX2 = (int)(Math.floor(Math.random()*10));
		lineY1 = (int)(Math.floor(Math.random()*10));
		lineY2 = (int)(Math.floor(Math.random()*10));
				
		//Computing length of the line
		xCoorDiff = lineX1-lineX2;
		yCoorDiff = lineY1-lineY2;	
		double lineLength = Math.sqrt((Math.pow(xCoorDiff,2))+(Math.pow(yCoorDiff,2)));
		System.out.println("Length of the line "+lineLength+" units");
	
	}

}
