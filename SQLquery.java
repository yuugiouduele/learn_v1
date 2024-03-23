package exam;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class SQLquery extends SQLException {
	public static void main(String[] args) {
		String call = "{call myprocedure(?,?)}";
		try (
				Connection con = DbConnector.getConnect();
				CallableStatement cst = (CallableStatement) con.prepareCall(call)) {
			cst.setInt(1, 11000);
			cst.registerOutParameter(2, java.sql.Types.BIGINT);
			cst.execute();
			int rest = cst.getInt(2);
			System.out.println(rest);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
