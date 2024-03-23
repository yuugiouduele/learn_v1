package exam;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
public class Exam9100 {
	public static void main(String[] args) throws Exception {
		 Date now = Calendar.getInstance().getTime();
		 
		 HashMap<String, Object> personal1 = new HashMap<String, Object >();
		 personal1.put("NAME", "菅原 駿太");
		 personal1.put("COMPANY", "株式会社 スリーホープ");
		 personal1.put("DEPARTMENT", "営業三部");
		 personal1.put("POSITION", "部長");
		 personal1.put("REGDATE", now); //Date 型でも登録可能
		 
		 HashMap<String, Object > personal2 = new HashMap<String, Object >();
		 personal2.put("NAME", "加藤 直志");
		 personal2.put("COMPANY", "相模工業 株式会社");
		 personal2.put("DEPARTMENT", "企画営業部");
		 personal2.put("POSITION", "企画営業部");
		 personal2.put("REGDATE", now);
		 HashMap<String, Object > personal3 = new HashMap<String, Object >();
		 personal3.put("NAME", "後藤 洋介");
		 personal3.put("COMPANY", "（株）アトム");
		 personal3.put("DEPARTMENT", "IT グループ");
		personal3.put("POSITION", "");
		 personal3.put("REGDATE", now);
		 ArrayList<HashMap<String, Object >> meishi = new ArrayList<HashMap<String, Object >>();
		 meishi.add(personal1);
		 meishi.add(personal2);
		 meishi.add(personal3);
		 System.out.println(meishi);
		}

}
