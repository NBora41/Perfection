package duplicate;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		int col,row;
		
		System.out.println("enter no of lines");
		Scanner scr =new Scanner(System.in);
		int Z= scr.nextInt();
		if (Z>=3)
		    for( row=0;row<=2;row++)
		    {
		        for(col=1;col<=17;col++)
		        {
		            if((col>=3-row && col<=6+row)|| (col>=12-row && col<=15+row))
		           {
		             System.out.print("*");

		           }
		           else
		           {
		               System.out.print(" ");

		           }
		          System.out.println();

		           
		        }
		   }
		   for (row=0;row<9;row++)
		     {
		         for(int space=1;space<2*row-1;space++)
		         {
		             System.out.print(" ");

		         }
		         for(int star=1;star<=(17-2*row);star++)
		         {
		        	 System.out.print("*");}
		        
		         }
		   System.out.println();
		     }
		// TODO Auto-generated method stub

	}


