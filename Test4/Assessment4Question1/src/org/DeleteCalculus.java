package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteCalculus {
	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/sample_q";
		String uname = "root";
		String pword = "1234";

		try {
		Connection con=DriverManager.getConnection(url,uname,pword);
		System.out.println("Connection Created");
		System.out.println();

		String query="Delete from calculus;"; // java code
		// change the java code to SQL statement



		Statement stmt=con.createStatement();
		int a=stmt.executeUpdate(query);
		System.out.println("Records deleted from table : "+a);



		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		}

		}
