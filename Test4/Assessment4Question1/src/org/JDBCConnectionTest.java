package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionTest {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/sample_q";
		String uname="root";
		String pword="1234";

		Connection con=null;
		try {
		     con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection created");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}

/*
 * create table calculus( id int primary key, 
 * num1 int not null,
 * num2 int not null,
 * operation varchar(10) not null, 
 * result int ); 
 * select * from calculus;
 * insert into calculus values (1001, 10,11,'+',10+11);
 *  insert into calculus
 * values (1002, 10,10,'*',10*10);
 *  DELETE FROM calculus WHERE id=1003;
 *  drop table calculus;
 */

