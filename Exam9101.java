package exam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;


public class Exam9101 {
	public static void main(String[] args) throws Exception {
		 Calendar clndr = Calendar.getInstance();
		 //-----------------------------------------データ作成-----------------------------------
		 //一人目作成
		 HashMap<String, Object> personal1 = new HashMap<String, Object>();
		 personal1.put("NAME", "菅原 駿太");
		 personal1.put("COMPANY", "株式会社 スリーホープ");
		 personal1.put("DEPARTMENT", "営業三部");
		 personal1.put("POSITION", "部長");
		 ArrayList<HashMap<String,Object>> meetinglog = new ArrayList<HashMap<String,Object>>(); 
		 personal1.put("MEETING_LOG", meetinglog); //菅原駿太の HashMap に、ArrayList を登録
		 HashMap<String,Object> log11 = new HashMap<String, Object>();
		 clndr.set(2015, 3 -1, 8);
		 log11.put("DATE", clndr.getTime());
		 log11.put("MEMO", "いい感じ");
		 meetinglog.add(log11);
		 HashMap<String,Object> log12 = new HashMap<String, Object>();
		 clndr.set(2015, 4 -1, 5);
		 log12.put("DATE", clndr.getTime());
		 log12.put("MEMO", "もうひと押し");
		 meetinglog.add(log12);
		 //二人目登録
		 HashMap<String, Object> personal2 = new HashMap<String, Object>();
		 personal2.put("NAME", "加藤 直志");
		 personal2.put("COMPANY", "相模工業 株式会社");
		 personal2.put("DEPARTMENT", "企画営業部");
		 personal2.put("POSITION", "企画マネージャ");
		 ArrayList<HashMap<String,Object>> meetinglog2 = new ArrayList<HashMap<String,Object>>();
		 personal2.put("MEETING_LOG", meetinglog2);
		 HashMap<String,Object> log21 = new HashMap<String, Object>();
		 clndr.set(2015, 3 -1, 8);
		 log21.put("DATE", clndr.getTime());
		 log21.put("MEMO", "ご立腹");
		 meetinglog2.add(log21);
		 ArrayList<HashMap<String,Object>> meishi = new ArrayList<HashMap<String,Object>>();
		 meishi.add(personal1);
		 meishi.add(personal2);
		 //------------------------------------------------------------------------------------
		 //データ出力
		 String newline = System.getProperty("line.separator");
		 SimpleDateFormat fmt = new SimpleDateFormat("yyyy 年 M 月 d 日");
		 StringBuilder sb = new StringBuilder();
		 for(HashMap<String,Object> map : meishi){
		 sb.append("<person>").append(newline);
		 String name = (String)map.get("NAME");
		 sb.append(String.format("\t<name>%s</name>", name)).append(newline);
		 String company = (String)map.get("COMPANY");
		 sb.append(String.format("\t<company>%s</company>", company)).append(newline);
		 String department = (String)map.get("DEPARTMENT");
		 sb.append(String.format("\t<department>%s</department>", department)).append(newline);
		 String position = (String)map.get("POSITION");
		 sb.append(String.format("\t<position>%s</position>", position)).append(newline);
		 sb.append("\t<meeting-history>").append(newline);
		 for(HashMap<String,Object> meeting : (ArrayList<HashMap<String,Object>>)map.get("MEETING_LOG")){
		 sb.append("\t\t<item>").append(newline);
		 String date = fmt.format((Date)meeting.get("DATE"));
		 sb.append(String.format("\t\t\t<date>%s</date>", date)).append(newline);
		 String memo = (String)meeting.get("MEMO");
		 sb.append(String.format("\t\t\t<memo>%s</memo>", memo)).append(newline);
		 sb.append("\t\t</item>").append(newline);
		 }
		 sb.append("\t</meeting-history>").append(newline);
		 sb.append("</person>").append(newline);
		 }
		 System.out.println(sb);
		}

}
