package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertCalculus {
	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/sample_q";
		String uname="root";
		String pword="1234";
		try {
			Connection con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection created");
			String query="insert into Calculus values(1003,22,13,'-',22-13)";//java code
			//change java to sql statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Record Inserted");
			}
			
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	

	}

}

