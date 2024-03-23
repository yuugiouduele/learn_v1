package exam;

public class Exam612 {
		public static void main(String[] args)throws Exception {
			String a="あいう";
			int b1=67890;
			String b2=String.valueOf(b1);
			String return1=sum(a,b2);
			
			System.out.println(return1);
		}
		
		private static String sum(String a,String b2) {
			String sum=a+b2;
			
			return sum;
		}
	}


