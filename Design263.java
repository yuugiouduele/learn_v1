package exam;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import orbeq.data.Member;
import orbeq.data.MySqlClient;

public class Design263 {
	public static void main(String[] args) throws Exception {
		MySqlClient msc = null;

		try {
			msc = new MySqlClient();
			msc.open("localhost", 3306, "learn", "mysqluser", "mysqluser");
			long memberid = publishMemberId(msc);

			msc.startTransaction();
			ArrayList<Object> members = new ArrayList<Object>();
			
			Member member=createTestMemberData(memberid);
			members.add(member.getId());
			members.add(member.getSei());
			members.add(member.getMei());
			members.add(member.getSeiKana());
			members.add(member.getMeiKana());
			members.add(member.getGender());
			members.add(member.getTel());
			members.add(member.getEmail());
			members.add(member.getZip());
			members.add(member.getPref());
			members.add(member.getAddress1());
			members.add(member.getAddress2());
			String date=new SimpleDateFormat("yyyy/MM/dd").format(member.getBirthday());
			members.add(date);
			int bool=0;
			if(member.getDelete()) {
				 bool=1;
			}else {
				bool=0;
			}
			members.add(bool);

			msc.update(drawMemberRegistSql(),members);

			ArrayList<Object> param2 = new ArrayList<Object>();
			int d=Integer.parseInt(String.format("%08d", memberid));
			param2.add(d);
			param2.add(01);
			msc.update("insert into member_course (member_id, course_id, registdate) values ( ? , ? , now())", param2);
			msc.commitTransaction();
			System.out.println(String.format("%sの会員データを作成しました", memberid));
		} catch (Exception ex) {
			msc.rollbackTransaction();
			throw ex;
		} finally {
			msc.close();
		}
	}

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
	private static Member createTestMemberData(long memberid) {
		Calendar cal = Calendar.getInstance();
		Member member = new Member();
		member.setId(String.format("%08d",memberid));
		member.setSei("長谷川");
		member.setMei("正剛");
		member.setSeiKana("ハセガワ");
		member.setMeiKana("セイゴウ");
		member.setGender("1");
		member.setTel("0489927112");
		member.setEmail("sei_hasegawa@pt2.sm.co.jp");
		member.setZip("3400805");
		member.setPref("11");
		member.setAddress1("草加市 東弁天 5-9-11");
		member.setAddress2("");
		cal.set(1977, 8, 15);
		member.setBirthday(new Date(cal.getTimeInMillis()));
		member.setDelete(false);
		return member;
	}

	private static long publishMemberId(MySqlClient msc) throws Exception {

		try {

			ArrayList<HashMap<String, Object>> result = msc
					.select("select id + 1 from seq_manage where class='01' for update");

			long memberid = (long) result.get(0).get("id + 1");
			String id = Long.toString(memberid);
			int mid = Integer.parseInt(id);
			ArrayList<Object> param = new ArrayList<Object>();
			param.add(mid);
			param.add(mid - 1);
			if (msc.update("update seq_manage set id=? where class='01' and id=?", param) != 1)
				throw new Error("会員番号が正しく取得できませんでした");

			return memberid;
		} catch (Exception ex) {
			throw ex;
		} finally {

		}

	}
}