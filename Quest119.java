package exam;

import java.util.ArrayList;
import java.util.Random;

public class Quest119 {
	public static void main(String[] args) {
		Random rnd = new Random();
		ArrayList<Integer> data = new ArrayList<Integer>();
		ArrayList<Integer> count1 = new ArrayList<Integer>();
		ArrayList<Integer> count2= new ArrayList<Integer>();
		ArrayList<Integer> count3 = new ArrayList<Integer>();
		ArrayList<Integer> count4 = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			int rnddata = rnd.nextInt(100) + 1;
			data.add(rnddata);
			if(rnddata%2==0){
				count1.add(rnddata);
			}else if(rnddata%3==0){
				count2.add(rnddata);
			}else if(rnddata%5==0){
				count3.add(rnddata);
			}else if(rnddata%7==0){
				count4.add(rnddata);
			}
		}
		System.out.println("2:"+count1.size());
		System.out.println("3:"+count2.size());
		System.out.println("5:"+count3.size());
		System.out.println("7:"+count4.size());
	}
}
