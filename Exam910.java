package exam;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam910 {
	public static void main(String[] args) throws Exception {
		 HashMap<String, String> personal1 = new HashMap<String, String>();
		 personal1.put("NAME", "菅原 駿太");
		 personal1.put("COMPANY", "株式会社 スリーホープ");
		 personal1.put("DEPARTMENT", "営業三部");
		 personal1.put("POSITION", "部長");
		 HashMap<String, String> personal2 = new HashMap<String, String>();
		 personal2.put("NAME", "加藤 直志");
		 personal2.put("COMPANY", "相模工業 株式会社");
		 personal2.put("DEPARTMENT", "企画営業部");
		 personal2.put("POSITION", "企画営業部");
		 HashMap<String, String> personal3 = new HashMap<String, String>();
		 personal3.put("NAME", "後藤 洋介");
		 personal3.put("COMPANY", "（株）アトム");
		 personal3.put("DEPARTMENT", "IT グループ");
		 personal3.put("POSITION", "");
		 ArrayList<HashMap<String, String>> meishi = new ArrayList<HashMap<String, String>>();
		 meishi.add(personal1);
		 meishi.add(personal2);
		 meishi.add(personal3);
		 String company = personal3.get("COMPANY");
		 System.out.println(company); // (株)アトム が表示される
		 System.out.println(meishi.get(0).get("NAME")); // 菅原 駿太 が表示される
		 System.out.println(meishi);
		 
		 }

}
