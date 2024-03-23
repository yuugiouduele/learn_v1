package exam;

public class Quest26 {
	public static void main(String[] args) {
		String[] inputStrings = new String[9];
		inputStrings[0] = "aaaaaaaaaa";
		inputStrings[1] = "aaaaaaaaaaa";
		inputStrings[2] = "a";
		inputStrings[3] = "";
		inputStrings[4] = "aaaaaaaaaA";
		inputStrings[5] = "opqrstuvwx";
		inputStrings[6] = "yzbcdefghi";
		inputStrings[7] = "jklmn";
		inputStrings[8] = "aaaaaaaaa1";
		for (int i = 0; i < 9; i++) {
			if (canRegistMemberName(inputStrings[i])) {
				
				} else {
					System.out.println(i);
				}

		}
	}
	private static boolean canRegistMemberName(String s) {
		boolean bool;
		if (s.strip().matches("^[a-z]{1,10}$")) {
			bool = true;
		} else {
			bool = false;
		}
		return bool;

	}
}
