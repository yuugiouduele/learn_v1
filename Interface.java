package exam;

	interface If1 {
		String s1 = "If1"; // public static finalがついているものとみなされる
		void m1(); // public abstractがついているものとみなされる。戻り値、メソッド名、引き数のみ定義する。
		}
		interface If2 {
		String s2 = "If2";
		void m2();
		}
		interface If3 extends If1, If2 { // 多重継承できます。
		String s3 = "If3";
		void m3();
		String m3(String str); // 戻り値、メソッド名、引き数のみ定義する。
		}
		interface If4 {
		String s4 = "If4";
		void m4();
		}
		class IfSample implements If3, If4 { // 複数のインタフェースを実装できます。
		public void m1() {
		System.out.println("Interface " + s1 + " の実装");
		}
		public void m2() {
		System.out.println("Interface " + s2 + " の実装");
		}
		public void m3() {
		System.out.println("Interface " + s3 + " の実装");
		}
		public String m3(String str) {
		System.out.println("Interface " + s3 + " の実装（引数：" + str + "）");
		return str + str;
		}
		public void m4() {
		System.out.println("Interface " + s4 + " の実装");
		}
		}
		public class Interface {
		public static void main(String[] args) {
		IfSample ifsample = new IfSample();
		ifsample.m1();
		ifsample.m2();
		String ifm3 = ifsample.m3("abcde");
		System.out.println(ifm3);
		If4 ifsample4 = new IfSample(); // インタフェースを参照型として使用できます。
		ifsample4.m4();
		}
		}

