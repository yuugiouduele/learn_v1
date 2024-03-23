package exam;

public class Quest113 {
	public static void main(String[] args) {
		int s=0;
		for(int i=1;i<=10000;i++) {
		if(i%2==0) {
			s+=i;
		}
		}
		System.out.println(s);
		}
}
