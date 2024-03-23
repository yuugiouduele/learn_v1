package exam;

public class Exam61 {
	public static void main(String[] args)throws Exception {
		int a=12345;
		int b=67890;
		
		int return1=sum(a,b);
		
		System.out.println(return1);
	}
	
	private static int sum(int a,int b) {
		int sum=a+b;
		
		return sum;
	}
}
