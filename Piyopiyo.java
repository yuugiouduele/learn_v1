package exam;

import orbeq.exam.Piyo;

public class Piyopiyo {
	public static void main(String[] args) {
		Piyo piyo = new Piyo();
		say(piyo);
		
	}

	private static void say(Piyo piyo) {
		System.out.println(piyo.sayPiyo());
	}
}
