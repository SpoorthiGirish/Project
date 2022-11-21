package org;

import java.util.Scanner;

public class Calculation {
	
	public static int checkMaxNum(int[] arr)
	{
		int i,j,n=10,temp=0;
		for(i=0;i<n;i++)
		{
			
				if(arr[i] > temp)
				{
				 temp= arr[i];
				}
		}
		return temp;
}
	
	
	public static String  checkPalindrome(String str)
	{
		
		String ori=str; 
		String rev= ""; 
	       
	      int length = ori.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         rev = rev + ori.charAt(i);
		return rev;  
	         
	}
	
	public static  int checkAreaCircle(double r)
	{
//		 Scanner sc = new Scanner(System.in);
//		 
//		 double r = sc.nextDouble();
		
		double p = 3.14;
		double area;
		area = p*r*r;
		return (int) area;
	
		
	}
	
	
}

