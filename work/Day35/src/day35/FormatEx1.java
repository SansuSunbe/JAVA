package day35;

import java.text.DecimalFormat;

public class FormatEx1 {
	public static void main(String[] args) {

		String[] pattern = {"###.###", "000.000", "-###.###", "000000.00%"};
		
		double[] arr = {1.3, 3.33, 124.243, 242};
		
		for(int i = 0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.println("<<< " + pattern[i] + " >>>");
			for(int j = 0; j < arr.length; j++) {
				System.out.println(df.format(arr[j]));
			}
		}

	}
}
