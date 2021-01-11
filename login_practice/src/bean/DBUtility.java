package bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {


	public static Connection getMysqlDBConnection() {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/java_db";
		String uName="root";
		String uPassword="root";
		Connection con = null;

		try {

			//STEP3	(Load Suitable Driver)
			Class.forName(driverClassName);

			//STEP4 ( Perform the connection from java to DBMS)
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(url,uName, uPassword);

		}catch(Exception e) {
			System.out.println("DBUtil catch"+e);
		}
		return con;
	}


}
