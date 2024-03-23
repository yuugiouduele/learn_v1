package exam;

public class Quest25 {
	public static void main(String[] args) {
		String[] inputStrings = new String[11];
		inputStrings[0] = "12345";
		inputStrings[1] = "9";
		inputStrings[2] = "0";
		inputStrings[3] = "-5";
		inputStrings[4] = "999";
		inputStrings[5] = "1000";
		inputStrings[6] = "3ab";
		inputStrings[7] = "88";
		inputStrings[8] = "**1";
		inputStrings[9] = "+25";
		inputStrings[10] = "-1";
		for (int i = 0; i < 11; i++) {
			if (canRegistQuantity(inputStrings[i])) {
				
				} else {
					System.out.println(i);
				}

		}
	}

	private static boolean canRegistQuantity(String s) {
		boolean bool;
		if (s.matches("^[+1-9]{1,3}$")) {
			bool = true;
		} else {
			bool = false;
		}
		return bool;

	}
}
