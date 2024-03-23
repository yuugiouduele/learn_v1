package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Extra222 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Statement stmt=null;
		
			Connection dbconnection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learn?useUnicode=true",
					"mysqluser", "mysqluser");
			stmt = dbconnection.createStatement();
			
			StringBuilder sb=new StringBuilder();
			sb.append("select*from member");
			
			ResultSet rst = stmt.executeQuery(sb.toString());
		
			try {
			while (rst.next()) {
				String sei = rst.getString("sei");
				String mei = rst.getString("mei");
				String seikana = rst.getString("sei_kana");
				String meikana = rst.getString("mei_kana");
				String gender=rst.getString("gender");
				Date d = rst.getDate("signupdate");
				System.out.println(String.format("%s %s (%s %s)(%s) 入会日%s", sei, mei,
						seikana, meikana,gender, d));
				
			}
			rst.close();
			stmt.close();
			dbconnection.close();
		} catch (Exception ex) {
			throw ex;
		}finally {
			rst.close();
			stmt.close();
			dbconnection.close();
		}
			
			

	}
}