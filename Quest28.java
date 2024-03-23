package exam;

public class Quest28 {
	public static void main(String[] args) {
		String[] inputStrings = new String[13];
		inputStrings[0] = "";
		inputStrings[1] = "Ａ";
		inputStrings[2] = "AＡ";
		inputStrings[3] = "aＡＢＣ";
		inputStrings[4] = "aあいう";
		inputStrings[5] = "ABCDE";
		inputStrings[6] = "あいうえおかきくけこさしすせそたちつてとなにぬねのはひふへほまみむめもやゆよらりるれろわをん";
		inputStrings[7] = " がぎぐげござじずぜぞだぢづでどばびぶべぼぱぴぷぺぽぁぃぅぇぉゃゅょっ";
		inputStrings[8] = "アイウエオカキクケコサシスセソタチツテトナニヌネノハヒフヘホマミムメモヤユヨラリルレロワヲン";
		inputStrings[9] = "ガギグゲゴザジズゼゾダヂヅデドバビブベボパジプペポァィゥェォャュョッ ";
		inputStrings[10] = "一絇片龴";
		inputStrings[11] = " ";
		inputStrings[12] = "　";
		for (int i = 0; i < 13; i++) {
			if (hasWideCharString(inputStrings[i])) {
				
				} else {
					System.out.println(i);
				}

		}
	}
	private static boolean hasWideCharString(String s) {
		boolean bool;
		if (s.strip().matches(".[\\p{Script=Han}\\p{Script=Hiragana}\\p{Script=Katakana}\\p{InCJKSymbolsAndPunctuation}ーa-z0-9ａ-ｚＡ-Ｚ々〆〤〓〒〠〡〢〣〤〥〦〧〨〩〪〭〮〯〫〬〰〱〲〳〴〵〶〷〸〹〺〜〻〼〽〾〿]+$")) {
			bool = true;
		} else if(s=="　" || s=="Ａ"){
			bool=true;
		}else {
			bool = false;
		}
			
	
		return bool;

	}
}
