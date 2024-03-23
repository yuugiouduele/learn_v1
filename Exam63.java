package exam;

import java.util.ArrayList;

public class Exam63 {
	public static void main(String[] args) throws Exception {
		 String str = "ABC";
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 list.add(1);
		 int i = 1;
		 System.out.println("変更前 str：" + str);
		 System.out.println("変更前 list：" + list.toString());
		 System.out.println("変更前 i：" + i);
		 hoge(str);
		 hoge2(list);
		 hoge3(i);
		 System.out.println("変更後 str：" + str);
		 System.out.println("変更後 list：" + list.toString());
		 System.out.println("変更後 i：" + i);
		 }
		 private static void hoge(String strstr) {
		 strstr = "DEF"; // ここで参照型仮引数 a を変更
		 System.out.println("変更中 str：" + strstr);
		 }
		 private static void hoge2(ArrayList<Integer> listlist) {
		 listlist.add(2); // ここで参照型仮引数 b を変更
		 System.out.println("変更中 list：" + listlist.toString());
		 }
		 private static void hoge3(int ii) {
		 ii = 2; // ここで参照型仮引数 c を変更
		 System.out.println("変更中 i：" + ii);
		 }

}
