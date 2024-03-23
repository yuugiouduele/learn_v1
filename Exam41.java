package exam;

import java.util.ArrayList;

public class Exam41 {
	public static void main(String[] args) {
		ArrayList<Integer>totalPayments=new ArrayList<Integer>();
		
		totalPayments.add(48000);
		totalPayments.add(40000);
		totalPayments.add(45000);
		totalPayments.add(70000);
		totalPayments.add(10000);
		totalPayments.add(45000);
		
		System.out.println("最初のリスト");
		
		for(int i=0;i<totalPayments.size();i++) {
			int totalPayment=totalPayments.get(i);
			System.out.println(totalPayment);
		}
		System.out.println("挿入");
		
		totalPayments.add(1,99999);
		
		for(int i=0;i<totalPayments.size();i++) {
			int totalPayment=totalPayments.get(i);
			System.out.println(totalPayment);
		}
		System.out.println("4番目の要素を削除");
		
		totalPayments.remove(3);
		
		for (int i = 0; i < totalPayments.size(); i++) {
			 int totalPayment = totalPayments.get(i);
			 System.out.println(totalPayment);
			 }
	}
}
