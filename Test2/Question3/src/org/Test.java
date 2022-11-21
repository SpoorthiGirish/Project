package org;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter credit card number");
		long credit = sc.nextLong();
		System.out.println("enter cvv");
		int cvv = sc.nextInt();
		
		
		PaymentGateway pg = new PaymentGateway();
		try {
			pg.checkMethod(credit, cvv, name);
		} catch (InvalidCreditCard | InvalidCVV | InvalidName e) {
			
			e.printStackTrace();
		}

	}

}