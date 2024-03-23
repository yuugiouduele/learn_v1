package exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Update {
public static void main(String[] args) throws Exception {
Class.forName("com.mysql.jdbc.Driver");
Connection con = null;
PreparedStatement pstmt = null;
try {
con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/learn?useUnicode=true",
"mysqluser",
"mysqluser");
con.setAutoCommit(false);
String sql = "update member set email= ? where member_id = ?";
pstmt = con.prepareStatement(sql);
pstmt.setString(1, "masataka@cview.co.jp");
pstmt.setString(2, "00000001");
int count = pstmt.executeUpdate();
con.commit();
System.out.println(String.format("%s件処理されました", count));
} catch (Exception ex) {
throw ex;
} finally {
if(pstmt != null) pstmt.close();
if(con != null) con.close();
}
}
}
