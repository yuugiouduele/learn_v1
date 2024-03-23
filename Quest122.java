package exam;

import java.util.ArrayList;
import java.util.Collections;

public class Quest122 {
	public static void main(String[] args) {
		char[] c = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String s=null;
		ArrayList<String> S=new ArrayList<String>();
		for(int i=0;i<c.length;i++) {
			s=String.valueOf(c[i]);
			S.add(s);
		}
			Collections.shuffle(S);
			
		
		String A=String.join("",S);
		System.out.println(A);
	}
}
