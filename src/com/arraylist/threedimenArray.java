package com.arraylist;

public class threedimenArray {
	
		public static void main(String[] args) {
			//int[] array = { 1, 2, 3, 4, 5 };
			int[][][] arraarr ;
//			for (int n = 0; n < array.length; n++) {
//				System.out.println(array[n]);
//			}
			//System.out.println(arraarr.length);
			int n=5;
			for (int i = 0; i < n; i++) {
				System.out.println(i);
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
					System.out.println("arr[" + i + "][" + j + "] [" + k + "] ");
				}
				}
			}
		}
}
