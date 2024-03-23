package exam;

import java.util.ArrayList;
import java.util.Random;

public class Exam55 {
	public static void main(String[] args) {
		 String[] fruits = { "モモ", "バナナ", "イチゴ", "メロン", "キウイ", "ミカン", "リンゴ",
		 "スイカ", "ブドウ", "ナシ" };
		 ArrayList<String> basket = new ArrayList<String>();
		 Random rnd = new Random();
		 
		 while(basket.size()<5) {
			 String fruit;
			 
			 do {
				 fruit =fruits[rnd.nextInt(fruits.length)];
			 }while (basket.contains(fruit));
			 
			 basket.add(fruit);
		 }
		 
		 for(String fruit:basket) {
			 System.out.println(String.format("%sをいただきます。",fruit));
		 }
	}
}
