package exam;
import com.mysql.cj.util.StringUtils;

public class Quest23 {
	public static void main(String[] args) {
		String[] inputStrings = new String[12];
		inputStrings[0] = "toyoshima";
		inputStrings[1] = "1234";
		inputStrings[2] = "Toyo@cview.co.jp";
		inputStrings[3] = "";
		inputStrings[4] = " ";
		inputStrings[5] = " abebe";
		inputStrings[6] = "";
		inputStrings[7] = " abebe ";
		inputStrings[8] = "　";
		inputStrings[9] = "toyo1toyo";
		inputStrings[10] = null;
		inputStrings[11] = "　豊島です　";
		for(int i=0;i<12;i++) {
			if(isNumber(inputStrings[i])) {
				System.out.println(i);
			}
		}
	}
	private static boolean isNumber(String s) {
		boolean bool;
		if(StringUtils.isStrictlyNumeric(s)) {
			bool=true;
		}else {
			bool=false;
		}
		return bool;
	}
}
