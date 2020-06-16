package com.arraylist;

public class DoubleDimenArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[][] arraarr = { { 1, 6 }, { 2, 7 }, { 3, 8 }, { 4, 9 } };
		for (int n = 0; n < array.length; n++) {
			System.out.println(array[n]);
		}
		System.out.println(arraarr.length);
		for (int i = 0; i < arraarr.length; i++) {
			System.out.println(i);
			for (int j = 0; j < 2; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arraarr[i][j]);
			}

			// int[][] arr = { { 1, 2 }, { 3, 4 } };
			//
			// for (int i = 0; i < 2; i++)
			// for (int j = 0; j < 2; j++)
			// System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);

		}
	}
}
