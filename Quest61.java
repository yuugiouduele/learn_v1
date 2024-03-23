package exam;

import java.util.ArrayList;
import java.util.HashMap;

import orbeq.data.Member;
import orbeq.data.MySqlClient;

public class Quest61 {
	public static void main(String[] args) throws Exception {
		MySqlClient msc=null;
		try {
			msc=new MySqlClient(); 
			msc.open("localhost", 3306,"learn" ,"mysqluser", "mysqluser");
			msc.startTransaction();
			ArrayList<Member>mm=new ArrayList<Member>();
			
			ArrayList<HashMap<String, Object>> data=msc.select("SELECT*FROM member m LEFT JOIN member_course mc ON m.member_id=mc.member_id ");
			for (HashMap<String, Object> record : data) {
				Member member = new Member();
				member.getCourses().add((String)record.get("course_id"));
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
				
				mm.add(member);
			}
			System.out.println(mm.get(0).getSei());
			System.out.println(mm.get(0).getCourses().get(0));
			System.out.println(mm.get(0).getCourses().size());
			msc.commitTransaction();
		}catch(Exception ex) {
			msc.rollbackTransaction();
			throw ex; 
		}finally {
			msc.close();
		}
	}
}
