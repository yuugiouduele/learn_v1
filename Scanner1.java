package exam;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("入力してください。");
		
		String input=scan.nextLine();
		
		int number=input.length();
		
		System.out.println(input+number+"が入力されました。");
		
		scan.close();
	}
}
