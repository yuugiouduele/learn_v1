package exam;

import java.util.ArrayList;
import java.util.Random;

public class Quest126 {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Random r=new Random();
		ArrayList<String>S=new ArrayList<String>();
		for(int i=0;i<5;i++) {
			char c=alphabet.charAt(r.nextInt(26));
			String s=String.valueOf(c);
			S.add(s);
		}
		String A=String.join("",S);
		System.out.println(A);
	}
}
