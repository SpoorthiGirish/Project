package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadCalculus {


public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/sample_q";
		String uname="root";
		String pword="1234";
		try {
			Connection con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection created");
			String query="select * from calculus";//java code
			//String query="select * from Customer where id=1001";
			//change java to sql statement
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);// query result table is stored , to read number of rows
			while(rs.next()) {
				int id=rs.getInt(1);
				int num1=rs.getInt(2);
				int num2=rs.getInt(3);
				String operation=rs.getString(4);
				int result=rs.getInt(5);
				System.out.println(" Id:" + id +"\n Num1:"+ num1+"\n Num2:" + num2+ "\n Operation:"+operation+ "\n Result:"+result);
				System.out.println("-------------------------");
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

