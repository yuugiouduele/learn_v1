package exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
public class Sql1 {
public static void main(String[] args) throws Exception {
Class.forName("com.mysql.jdbc.Driver");
Connection dbconnection = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/learn?useUnicode=true",
"mysqluser", "mysqluser");
Statement stmt = dbconnection.createStatement();
ResultSet rst = stmt.executeQuery("select * from member");
while (rst.next()) {
String sei = rst.getString("sei");
String mei = rst.getString("mei");
String seikana = rst.getString("sei_kana");
String meikana = rst.getString("mei_kana");
Date d = rst.getDate("birthday");
System.out.println(String.format("%s %s (%s %s) %s生まれ", sei, mei,
seikana, meikana, d));
}
rst.close();
stmt.close();
dbconnection.close();
}
}