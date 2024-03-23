package exam;

public class Quest39 {
	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			int a=2000;
			if(isLeapYear(a+i)) {
				System.out.println(a+i+"○");
			}else {
				System.out.println(a+i+"×");
			}
		}
	}
	private static boolean isLeapYear(int a) {
		boolean bool;
		if(a%4==0 && !(a%100==0) || a%400==0) {
			bool=true;
		}else {
			bool=false;
		}
		return bool;
	}
}
