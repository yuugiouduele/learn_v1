package exam;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam911 {
	public static void main(String[] args) throws Exception {
		 HashMap<String, String> personal1 = new HashMap<String, String>();
		 personal1.put("NAME", "菅原　駿太");
		 personal1.put("TEL", "090133290498");
		 personal1.put("BIRTHDAY","1980/06/17");
		 HashMap<String, String> personal2 = new HashMap<String, String>();
		 personal2.put("NAME", "加藤　直志");
		 personal2.put("TEL", "080254902109");
		 personal2.put("BIRTHDAY","1978/12/08");
		 HashMap<String, String> personal3 = new HashMap<String, String>();
		 personal3.put("NAME", "藤田　夏香");
		 personal3.put("TEL", "080928401854");
		 personal3.put("BIRTHDAY","1992/08/13");
		 ArrayList<HashMap<String,String>>meishi=new ArrayList<HashMap<String,String>>();
		 meishi.add(personal1);
		 meishi.add(personal2);
		 meishi.add(personal3);
		 System.out.println(meishi.get(0).get("NAME"));
		 System.out.println(meishi.get(0).get("TEL"));
		 System.out.println(meishi.get(0).get("BIRTHDAY"));
	}
}
