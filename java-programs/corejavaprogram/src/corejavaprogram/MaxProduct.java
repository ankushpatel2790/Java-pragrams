package corejavaprogram;

import java.util.Arrays;
/**
 * Solve maximum product of three array elements.
 * @author Ankush.Patel
 *
 */
public class MaxProduct {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 10, 7, 8, 9, 5, 6, 74,2, -5, -9, -78 };
		getMaxProduct(arr);
	}

	public static void getMaxProduct(int... data) {
		Arrays.sort(data);
		for(int i:data)
			System.out.println(i);
		System.out.println(data[data.length - 1] * data[data.length - 2] * data[data.length - 3]);
	}
}
