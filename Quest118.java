package exam;

import java.util.ArrayList;
import java.util.Random;

public class Quest118 {
	public static void main(String[] args) {
		Random rnd = new Random();
		ArrayList<Integer> data = new ArrayList<Integer>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			int rnddata = rnd.nextInt(100) + 1;
			data.add(rnddata);
			if(rnddata%2==0){
				count.add(rnddata);
			}
		}
		System.out.println(count.size());
	}
}
