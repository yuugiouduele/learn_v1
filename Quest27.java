package exam;

public class Quest27 {
	public static void main(String[] args) {
		String[] inputStrings = new String[9];
		inputStrings[0] = "1111111";
		inputStrings[1] = "11111111";
		inputStrings[2] = "111111";
		inputStrings[3] = "1";
		inputStrings[4] = "";
		inputStrings[5] = "1234567";
		inputStrings[6] = "8901234";
		inputStrings[7] = "111111a";
		inputStrings[8] = "１２３４５６７";
		for (int i = 0; i < 9; i++) {
			if (isZipCode(inputStrings[i])) {
				
				} else {
					System.out.println(i);
				}

		}
	}
	private static boolean isZipCode(String s) {
		boolean bool;
		if (s.strip().matches("^[0-9]{7}$")) {
			bool = true;
		} else {
			bool = false;
		}
		return bool;

	}
}
