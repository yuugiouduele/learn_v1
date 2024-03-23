package exam;

import java.util.Random;

public class Exam512 {
	public static void main(String[] args) {
		int[] distribution=new int[100];
		for(int i=0;i<100;i++) 
			distribution[i]=0;
		
		Random rnd=new Random();
		for(int i=0;i<100000;i++)
		   distribution[rnd.nextInt(100)]+=1;
		
		for(int i=0;i<100;i++) {
			String message=String.format("乱数[%s]の出現回数:%s回",i,distribution[i]);
			System.out.println(message);
		}
	}
}
