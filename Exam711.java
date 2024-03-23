package exam;

public class Exam711 {
	public static void main(String[] args) {
		String str = "00002 伊志村 光輝 19980403 0 koki_ishimura@cview.co.jp";

		String return1 = divideStr(str);

		System.out.println(return1);
	}

	public static String divideStr(String str) {
		
		String Str="";
		
		String[] list =str.split(" ");
		for(String s:list) {
			Str+= (","+s);
		}
		String divideStr=Str;
		return divideStr;
	}

}
