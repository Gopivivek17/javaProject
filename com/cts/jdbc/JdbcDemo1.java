
package com.cts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JdbcDemo1 {
 
	public static void main(String[] args) throws ClassNotFoundException {
 
		try
		{
//Step 1  : To Load (or) register the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
 
		
	//Step 2: Connecting specified database:
 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root","root");
		
		
		//Step3  	Create Statement interface
		
		Statement stm=con.createStatement();
		
//		String query1="create table employ(id int, ename varchar(20), job varchar(15))";
		
//		insert into employ values(104,'akhil','testing')
		
//		String query2="update employ set ename = 'Ram' where id = '102'";
		
		//step4 execute sql query
		
//		stm.executeUpdate(query2);
		
//		System.out.println("record updated Successfully.......");
		
//		select * from employ where id != '102'
		
		ResultSet rs = stm.executeQuery(" select upper(concat(first_name,' ',last_name)) as ActorName from actor ");
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
		

 
		//step 5 To Close connection
		stm.close();
		con.close();
		
		
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
	}
 
}