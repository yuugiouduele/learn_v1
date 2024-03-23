package exam;

public class jiscode {
	public static void main(String[] args) throws Exception {
		byte[] bytes = {(byte)227, (byte)129,(byte)130};
		String s = new String(bytes,"UTF8"); //バイトデータをShift JIS 文字として認識させる
		System.out.println(s);
		}
}
