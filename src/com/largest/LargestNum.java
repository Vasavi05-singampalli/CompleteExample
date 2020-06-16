package com.largest;

public class LargestNum {
	static int ary[]={23,34,45,54,32,21};//ary[0]=23,1=34,2=45....
	static int max=ary[0];//max value is 23

	public static void main(String[] args) {
		for(int i=0;i<ary.length;i++){ //i=5
			if(ary[i]>max){ //21>54
				max=ary[i];//max=54
			}
		}
		System.out.println(max);
	}

}
