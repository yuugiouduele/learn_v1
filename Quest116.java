package exam;

import java.util.ArrayList;
import java.util.Random;

public class Quest116 {
	public static void main(String[] args) {
		Random rnd=new Random();
		ArrayList<Integer>data=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
		int rnddata=rnd.nextInt(100)+1;
		data.add(rnddata);
		System.out.println(data.get(i));
		}
		
	}
}
