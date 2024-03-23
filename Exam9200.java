package exam;

import java.util.HashMap;

public class Exam9200 {
	public static void main(String[] args) {
		 HashMap<String, Object> shopList = new HashMap<String, Object>();
		 HashMap<String, Object> shop1 = new HashMap<String, Object>();
		 shop1.put("NAME", "大宮店");
		 shop1.put("MEMBERS", 13);
		 shop1.put("MASTER", "大越賢也");
		 HashMap<String, Object> shop2 = new HashMap<String, Object>();
		 shop2.put("NAME", "草加店");
		 shop2.put("MEMBERS", 8);
		 shop2.put("MASTER", "宮田徹人");
		 shopList.put("0001-001", shop1);
		 shopList.put("0001-002", shop2);
		 System.out.println(shopList);
		 }

}
