package duplicate;

import java.util.Scanner;

public class reversestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bn;
		Scanner sc =new Scanner(System.in);
	 do {
		System.out.print("enter a String:");
		
		String St= sc.nextLine();
		String []words=St.split(" ");
		String revw="";
		for(String W:words)
		{
			 String reverse ="";
			
		
		   for(int i=W.length()-1;i>=0;i--)
		   {  
		      reverse+=W.charAt(i);
		      
		
	       }
		   
		
		revw=revw+reverse+" ";
		}
		System.out.println(revw);
		System.out.print("want to try more?");
		
		 bn =sc.nextLine();
	 }
		while(bn!=("no"));
	    
		
		
	}

}
