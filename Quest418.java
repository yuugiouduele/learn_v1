package exam;

import java.util.HashMap;

public class Quest418 {
	public static void main(String[] args) {
		HashMap<String,Object> r = new HashMap<String, Object>();
		HashMap<String,Object> r2 = new HashMap<String, Object>();
		HashMap<String,Object> r3 = new HashMap<String, Object>();
		r.put("Toyo", r2);
		r.put("Mura", 55);
		r.put("Yama", "hoge");
		
		r2.put("Fuwa", r3);
		r2.put("Obama",null );
		r2.put("Ababa", 8);
		
		r3.put("Mai", "yaha");
		r3.put("One", 30);
		
		r.forEach((k,v)->{if(v instanceof Object && k=="Toyo") {
			System.out.println("Toyo は HashMapが入っています。");
		}
		if(v instanceof Integer) {
			System.out.println("Mura は 55です");
		}
		if(v instanceof String) {
			System.out.println("Yama は hogeです");
		}
		});
		System.out.println(r);
		
	}
}
