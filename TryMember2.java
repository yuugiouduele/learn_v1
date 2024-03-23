package exam;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

import orbeq.data.Member;
import orbeq.data.MySqlClient;

public class TryMember2 {
	public static void main(String[] args) throws Exception {
		MySqlClient client = null;
		try {
			client = new MySqlClient();
			client.open("localhost", 3306, "learn", "mysqluser", "mysqluser");
			//会員番号 00000015 より若い会員を抽出
			ArrayList<Object> params = new ArrayList<Object>();
			params.add("00000015");
			ArrayList<HashMap<String, Object>> tabledata = client.select("select * from member where member_id < ?",
					params);
			//データ構造を作成
			ArrayList<Member> members = new ArrayList<Member>();
			for (HashMap<String, Object> record : tabledata) {
				Member member = new Member();
				member.setId((String) record.get("member_id"));
				member.setSei((String) record.get("sei"));
				member.setMei((String) record.get("mei"));
				member.setSeiKana((String) record.get("seiKana"));
				member.setMeiKana((String) record.get("seiMei"));
				member.setGender((String) record.get("gender"));
				member.setTel((String) record.get("tel"));
				member.setEmail((String) record.get("email"));
				member.setZip((String) record.get("zip"));
				member.setPref((String) record.get("pref"));
				member.setAddress1((String) record.get("address1"));
				member.setAddress2((String) record.get("address2"));
				member.setDelete("1".equals((String) record.get("deleteflg")));
				//誕生日はDate
				java.util.Date d = (java.sql.Date) record.get("birthday");
				member.setBirthday((Date) new Date(d.getTime()));
				//退会日と入会日はTimeStamp
				java.sql.Timestamp t = (java.sql.Timestamp) record.get("deletedate");
				member.setDeleteDate(t == null ? null : (Date) new java.util.Date(t.getTime()));
				t = (java.sql.Timestamp) record.get("signupdate");
				member.setSignupDate(t == null ? null : (Date) new java.util.Date(t.getTime()));
				members.add(member);
			}
			//データを利用する処理（とりあえずは出力だけ）
			for (Member member : members) {
				System.out.println(String.format("[%s] %s %s", member.getId(), member.getSei(), member.getMei()));
			}
		} catch (Exception ex) {
			throw ex;
		} finally {
			client.close();
		}
	}
}
