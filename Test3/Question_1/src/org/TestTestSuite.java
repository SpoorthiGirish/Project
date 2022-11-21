package org;

import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class TestTestSuite {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount: ");
		float p=sc.nextFloat();
		System.out.println("Enter rate of interest: ");
		float r= sc.nextFloat();
		System.out.println("Enter the time: ");
		float t=sc.nextFloat();
	
        float si  = (p*r*t)/100;   
        System.out.println("Simple Interest is: " +si);  
		Result result=JUnitCore.runClasses(TestSuiteClass.class);
		for(Failure x:result.getFailures())
		{
			System.out.println(x.toString());
		}
		System.out.println("Result = "+result.wasSuccessful());
	}
	
	}


