package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
public static Connection getConnect() throws SQLException{
	String url="jdbc:mysql://localhost:3306/golddb"+"?verifyServerCertificate=false&"+"useSSL=false&serverTimezone=JST";
	String user="root";
	String password="training";
	Connection con=DriverManager.getConnection(url,user,password);
	return con;
}
}
