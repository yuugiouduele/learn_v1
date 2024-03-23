package exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InputMember {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbconnection = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		// 入力があったとする
		String id = args[0];
		//inputMemberid=inputMemberid.replace("'","’").replace(";","；");
		try {
		dbconnection = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/learn", "mysqluser",
		"mysqluser");
		
		String sql = "select sei,mei,email from member where member_id=?";
		pstmt = dbconnection.prepareStatement(sql);
		pstmt.setString(1,id);
		rset = pstmt.executeQuery();
		while (rset.next()) {
		String sei = rset.getString("sei");
		String mei = rset.getString("mei");
		String email = rset.getString("email");
		System.out
		.println(String.format("%s %s [%s]", sei, mei, email));
		}
		} catch (Exception ex) {
		throw ex;
		} finally {
		if (rset != null) {
		rset.close();
		}
		if (pstmt != null) {
		pstmt.close();
		}
		if (dbconnection != null) {
		dbconnection.close();
		}
		}
		}
}
