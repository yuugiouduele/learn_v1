package exam;

import java.util.ArrayList;

public class Exam613 {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(19);
		data.add(25);
		data.add(39);
		data.add(8);

		double return1 = average(data);

		System.out.println(return1);

	}

	private static double average(ArrayList<Integer> data) {

		int sum = 0;

		for (int i : data) {
			sum += i;
		}

		double average = (double)sum / data.size();

		return average;
	}
}
