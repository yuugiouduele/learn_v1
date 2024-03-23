package exam;

import java.io.Console;

public class Console1 {
	public static void main(String[] args) {
		Console con=System.console();
		String name=con.readLine("%s","name :");
		System.out.println(name);
		
		char[] pw=con.readPassword("%s","password");
		for(char c:pw)
			System.out.print(c);
	}
}
