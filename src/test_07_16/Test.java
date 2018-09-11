package test_07_16;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[][] arr = { { 2, 5, 1, 6 }, { 5, 8, 2, 9 }, { 6, 9, 4, 0 } };
		int[][] arrT = transform(arr);
		for (int[] key : arrT)
			System.out.println(Arrays.toString(key));
	}

	public static int[][] transform(int[][] arr) {
		int[][] arrT = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arrT[j][i] = arr[i][j];
		return arr;
	}
}
