package com.learn.javacoding;

public class Pattern_Programming {

	public static void main(String[] args) {
		
		//outer for loop is for rows which shall be represented by i
		//inner for loop is for columns which shall be represented by j
		
		for(int i=0; i<5; i++)   {  
	 
		for(int j=0; j<=i; j++)  { 
		   System.out.print("* ");   
		}  
		
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		} 

	}

}
