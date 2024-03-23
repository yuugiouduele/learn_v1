package exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.mysql.cj.xdevapi.Collection;





public class Datasource1 {
private static DataSource ds=null;
private static DataSource getDataSource() throws NamingException{
	if(ds==null) {
		InitialContext ic=new InitialContext();
		ds=(DataSource)ic.lookup("java:com/env/jdbc/golddb");
	}
	return ds;
}
public Collection<User> findUsers()throws SQLException{
	Connection con=null;
	PreparedStatement ps=null;	
	ResultSet rs=null;
	try {
		String sql="SELECT *FROM user";
		DataSource ds=getDataSource();
		con=ds.getConnection();
		ps=con.prepareStatement(sql);
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		if(ps!=null)
			ps.close();
		if(con!=null)
			con.close();
	}
}
}
