package exam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.HashMap;

public class CreateMember {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbconnection = null;
		PreparedStatement pstmMember = null, pstmCourse = null;
		try {
			dbconnection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learn?useUnicode=true",
					"mysqluser",
					"mysqluser");
			//まずは会員IDを取得
			dbconnection.setAutoCommit(true);
			int memberid = publishMemberId(dbconnection);
			//トランザクション開始
			dbconnection.setAutoCommit(false);
			//会員データを登録
			pstmMember = dbconnection.prepareStatement(drawMemberRegistSql());
			HashMap<String, Object> memberData = createTestMemberData();
			pstmMember.setString(1, String.format("%08d", memberid));
			pstmMember.setString(2, (String) memberData.get("sei"));
			pstmMember.setString(3, (String) memberData.get("mei"));
			pstmMember.setString(4, (String) memberData.get("sei_kana"));
			pstmMember.setString(5, (String) memberData.get("mei_kana"));
			pstmMember.setString(6, (String) memberData.get("gender"));
			pstmMember.setString(7, (String) memberData.get("tel"));
			pstmMember.setString(8, (String) memberData.get("email"));
			pstmMember.setString(9, (String) memberData.get("zip"));
			pstmMember.setString(10, (String) memberData.get("pref"));
			pstmMember.setString(11, (String) memberData.get("address1"));
			pstmMember.setString(12, (String) memberData.get("address2"));
			pstmMember.setDate(13, (Date) memberData.get("birthday"));
			pstmMember.setString(14, (String) memberData.get("deleteflg"));
			if (pstmMember.executeUpdate() != 1)
				throw new Error("会員情報が入りませんでした");
			//コースデータを登録
			pstmCourse = dbconnection.prepareStatement(
					"insert into member_course (member_id, course_id, registdate) values ( ? , ? , now())");
			pstmCourse.setString(1, String.format("%08d", memberid));
			pstmCourse.setString(2, "01");
			if (pstmCourse.executeUpdate() != 1)
				throw new Error("コース情報が入りませんでした");
			//コミット
			dbconnection.commit();
			System.out.println(String.format("%sの会員データを作成しました", memberid));
		} catch (Exception ex) {
			dbconnection.rollback();
			throw ex;
		} finally {
			if (pstmMember != null)
				pstmMember.close();
			if (pstmCourse != null)
				pstmCourse.close();
			if (dbconnection != null)
				dbconnection.close();
		}
	}

	//会員IDを発番
	private static int publishMemberId(Connection dbconnection) throws Exception {
		Statement stmt = null;
		ResultSet rset = null;
		try {
			stmt = dbconnection.createStatement();
			rset = stmt.executeQuery("select id + 1 from seq_manage where class='01' for update");
			rset.next();
			int memberid = rset.getInt(1);
			String memberidupdateSql = String.format(
					"update seq_manage set id=%s where class='01' and id=%s", memberid, memberid - 1);
			if (stmt.executeUpdate(memberidupdateSql) != 1)
				throw new Error("会員番号が正しく取得できませんでした");
			return memberid;
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (rset != null)
				rset.close();
			if (stmt != null)
				stmt.close();
		}
	}

	//会員登録用SQLを返却
	private static String drawMemberRegistSql() {
		StringBuilder memberRegistSql = new StringBuilder();
		memberRegistSql.append("insert into member (");
		memberRegistSql.append("member_id,sei,mei,sei_kana,mei_kana,gender");
		memberRegistSql.append(",tel,email,zip,pref,address1,address2,birthday");
		memberRegistSql.append(",deleteflg,deletedate,signupdate,registdate,updatedate");
		memberRegistSql.append(") values (");
		memberRegistSql.append(" ?,?,?,?,?,?,?,?,?,?,?,?,?,?");
		memberRegistSql.append(",null,current_date(),now(),now()");
		memberRegistSql.append(")");
		return memberRegistSql.toString();
	}

	//テスト用の会員情報を作る
	private static HashMap<String, Object> createTestMemberData() {
		Calendar cal = Calendar.getInstance();
		HashMap<String, Object> memberData = new HashMap<String, Object>();
		memberData.put("sei", "長谷川");
		memberData.put("mei", "正剛");
		memberData.put("sei_kana", "ハセガワ");
		memberData.put("mei_kana", "セイゴウ");
		memberData.put("gender", "1");
		memberData.put("tel", "0489927112");
		memberData.put("email", "sei_hasegawa@pt2.sm.co.jp");
		memberData.put("zip", "3400805");
		memberData.put("pref", "11");
		memberData.put("address1", "草加市 東弁天 5-9-11");
		memberData.put("address2", "");
		cal.set(1977, 8, 15);
		memberData.put("birthday", new Date(cal.getTimeInMillis()));
		memberData.put("deleteflg", "0");
		return memberData;
	}
}