package exam;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

import orbeq.data.Member;
import orbeq.data.MySqlClient;

public class Quest62 {
	public static void main(String[] args) throws Exception {
		MySqlClient msc=null;
		BufferedWriter bw = null;
		try {
			msc=new MySqlClient(); 
			msc.open("localhost", 3306,"learn" ,"mysqluser", "mysqluser");
			msc.startTransaction();
			ArrayList<Member>mm=new ArrayList<Member>();
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
					"../files/members.html"), "UTF-8");
			bw = new BufferedWriter(osw);
			
			bw.write("<html>"+"\n"+"<body>"+"\n"+"<table>");
			
			ArrayList<HashMap<String, Object>> data=msc.select("SELECT*FROM member m LEFT JOIN member_course mc ON m.member_id=mc.member_id ");
			for (HashMap<String, Object> record : data) {
				Member member = new Member();
				member.getCourses().add((String)record.get("course_id"));
				member.setId((String) record.get("member_id"));
				member.setSei((String) record.get("sei"));
				member.setMei((String) record.get("mei"));
				member.setSeiKana((String) record.get("sei_kana"));
				member.setMeiKana((String) record.get("mei_kana"));
				member.setGender((String) record.get("gender"));
				member.setTel((String) record.get("tel"));
				member.setEmail((String) record.get("email"));
				
				mm.add(member);
				String gender=new String();
				if(record.get("gender").equals("1")) {
					gender="男";
				}else {
					gender="女";
				}
				bw.write("<tr>"+"\n"+"<td>"+(String) record.get("sei")+"　"+(String) record.get("mei")+"</td>"+"\n"+"<td>"+(String) record.get("sei_kana")+"　"+(String) record.get("mei_kana")+"</td>"+"\n"+"<td>"+gender+"</td>"+"\n"+"<td>"+(String) record.get("tel")+"</td>"+"\n"+"<td>"+(String) record.get("email")+"</td>"+"\n"+"</tr>"+"\n");
			}
			bw.write("</table>"+"\n"+"</body>"+"\n"+"</html>");
			System.out.println("作成しました。");
			msc.commitTransaction();
		}catch(Exception ex) {
			msc.rollbackTransaction();
			throw ex; 
		}finally {
			msc.close();
			if(bw!=null) {
				bw.close();
			}
		}
	}
}
