package exam;

import java.util.ArrayList;
import java.util.Random;

public class Exam520 {
	public static void main(String[] args) {
		 String[] fruits = { "モモ", "バナナ", "イチゴ", "メロン", "キウイ", "ミカン", "リンゴ",
		 "スイカ", "ブドウ", "ナシ" };
		 ArrayList<String> basket = new ArrayList<String>();
		 Random rnd = new Random();
		 for (int i = 0; i < 5; i++) {
		 String fruit = fruits[rnd.nextInt(fruits.length)];
		 System.out.println(String.format("%s をバスケットに追加", fruit));
		 basket.add(fruit);
		 }
		 System.out.println(basket.toString());
		 }

}
