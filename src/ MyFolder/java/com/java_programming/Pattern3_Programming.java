package com.java_programming;

public class Pattern3_Programming {
	
	public static void main(String[] arg) {

		for (int i= 1; i<= 5 ; i++)
        {
            for (int j=i; j <5 ;j++)            
        {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++)
            {
            System.out.print("*");
            }
            System.out.println("");
            } 
            for (int i=5; i>=1; i--)
        {
            for(int j=i; j<=5;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<i ;k++) 
            {
                System.out.print("*");
            }
            System.out.println("");
 
        }
	}

}
