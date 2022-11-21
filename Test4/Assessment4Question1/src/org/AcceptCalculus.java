package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AcceptCalculus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0;
		String url="jdbc:mysql://localhost:3306/sample_q";
		String uname = "root";
		String pword = "1234";

		System.out.print("Enter Id: ");
		int id = sc.nextInt();

		System.out.print("Enter num1: ");
		int num1=sc.nextInt();

		System.out.print("Enter num2: ");
		int num2=sc.nextInt();

		System.out.print("Enter Operation(+,-,*,/): ");
		char operation = sc.next().charAt(0);


		if(operation=='+')
		{
		result=num1+num2;
		System.out.println(result);
		}
		else if(operation=='-')
		{
		result=num1-num2;
		System.out.println(result);
		}
		else if(operation=='*')
		{
		result=num1*num2;
		System.out.println(result);
		}
		else if(operation=='/')
		{
		result=num1/num2;
		System.out.println(result);
		}

		try {

		Connection con=DriverManager.getConnection(url,uname,pword);
		System.out.println("Connection Created");
		System.out.println();

		String query="insert into calculus values("+id+","+num1+","+num2+",'"+operation+"',"+result+");"; // java code
		// change the java code to SQL statement

		Statement stmt=con.createStatement();
		stmt.executeUpdate(query);
		System.out.println("Record Inserted");

		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}



		}



		}