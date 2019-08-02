package com.yash.products.REstProduct.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class Datasource {

public static Connection getDBConnection(){
	Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/test","root","root");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	  
	return con;
}


}
