package exam;

public class Exam33 {
	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c=11;
		boolean a_eq_b=a==b;
		boolean a_eq_c=a==c;
		boolean a_it_c=a<c;
		boolean a_gt_c=a>c;
		boolean a_gte_b=a<=b;

		System.out.println(String.format("a と b は等しい (%s)", a_eq_b));
		System.out.println(String.format("a と c は等しい (%s)", a_eq_c));
		System.out.println(String.format("a は c より小さい (%s)", a_it_c));
		System.out.println(String.format("a は c より大きい (%s)", a_gt_c));
		System.out.println(String.format("a は b 以上 (%s)", a_gte_b));
		}

}
