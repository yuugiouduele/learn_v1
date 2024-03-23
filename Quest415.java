package exam;

import java.util.ArrayList;
import java.util.HashMap;

public class Quest415 {
	public static void main(String[] args) {
		String source = "Toyo,9999,8755,651,15,8777.9856,1234, 55, 47";
		String[] s=source.split(",");
		HashMap<String, ArrayList<String>> r = new HashMap<String, ArrayList<String>>();
		ArrayList<String>List=new ArrayList<String>();
		
		for(int i=1;i<s.length;i++) {
			
			List.add(s[i]);
			
		}
		r.put(s[0], List);
		System.out.println(r);
	}
}
