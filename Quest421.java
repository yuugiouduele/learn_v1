package exam;

import java.util.HashMap;

public class Quest421 {
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
			r2.forEach((k2,v2)->{if(v2 instanceof Object && k2=="Fuwa") {
				r3.forEach((k3,v3)->{
				if(v3 instanceof Integer) {
					System.out.println(v3);
				}
				if(v3 instanceof String) {
					System.out.println(v3);
				}
				});
			}
			
			else if(v2 instanceof Integer) {
				System.out.println(v2);
			}else {
				System.out.println(v2);
			}
			});
		}
		if(v instanceof Integer) {
			System.out.println(v);
		}
		if(v instanceof String) {
			System.out.println(v);
		}
		});
		
		System.out.println(r);
		
	}
}
