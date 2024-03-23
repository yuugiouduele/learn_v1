package exam;

import java.util.ArrayList;
import java.util.Random;

public class Quest123 {
	public static void main(String[] args) {
		char[] c = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String s=null;
		ArrayList<String> S=new ArrayList<String>();
		Random r = new Random();
		for (int i = 0; i < c.length-3; i++) {

			s=String.valueOf(c[r.nextInt(6)]);
			S.add(s);
			
			
		}
		String A=String.join("",S);
		System.out.println(A);
	}
}
