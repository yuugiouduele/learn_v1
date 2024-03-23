package exam;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam914 {
	public static void main(String[] args) throws Exception {
		HashMap<String, Object> personal1 = new HashMap<String, Object>();
		personal1.put("店名", "新宿本店");
		ArrayList<HashMap<String, Object>> person = new ArrayList<HashMap<String, Object>>();
		personal1.put("従業員", person);
		HashMap<String, Object> p = new HashMap<String, Object>();
		p.put("NAME1", "木田　康人");
		p.put("NAME2", "杉山　雅史");
		p.put("NAME3", "奥田　純");
		person.add(p);

		HashMap<String, Object> personal2 = new HashMap<String, Object>();
		personal2.put("店名", "大阪支店");
		ArrayList<HashMap<String, Object>> person2 = new ArrayList<HashMap<String, Object>>();
		personal2.put("従業員", person2);
		HashMap<String, Object> p2 = new HashMap<String, Object>();
		p2.put("NAME1", "高橋　久枝");
		p2.put("NAME2", "近藤　典子");
		person2.add(p2);

		HashMap<String, Object> personal3 = new HashMap<String, Object>();
		personal3.put("店名", "代々木支店");
		ArrayList<HashMap<String, Object>> person3 = new ArrayList<HashMap<String, Object>>();
		personal3.put("従業員", person3);
		HashMap<String, Object> p3 = new HashMap<String, Object>();
		p3.put("NAME1", "石川　大輔");
		p3.put("NAME2", "伴　俊明");
		p3.put("NAME3", "向田　幸一");
		person3.add(p3);

		p3.replace("NAME1", "石川　大介");
		ArrayList<HashMap<String, Object>> meishi = new ArrayList<HashMap<String, Object>>();
		meishi.add(personal1);
		meishi.add(personal2);
		meishi.add(personal3);
		//データ出力
		String newline = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder();
		for (HashMap<String, Object> store : meishi) {
			String name = (String) store.get("店名");
			sb.append(String.format("\t<店名>%s<店名>", name)).append(newline);
			for (HashMap<String, Object> m : (ArrayList<HashMap<String, Object>>) store.get("従業員")) {
				String mm1 = (String) m.get("NAME1");
				sb.append(String.format("\t\t<従業員>%s</従業員>", mm1)).append(newline);
				String mm2 = (String) m.get("NAME2");
				sb.append(String.format("\t\t<従業員>%s</従業員>", mm2)).append(newline);
				String mm3 = (String) m.get("NAME3");
				sb.append(String.format("\t\t<従業員>%s</従業員>", mm3)).append(newline);
			}
		}
				System.out.println(sb);
			
		
	}

}

