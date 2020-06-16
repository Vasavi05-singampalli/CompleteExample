package com.string;

public class Contain {

	public static void main(String[] args) {
		String name = "vasu:@" + ":vasavi:@" + ":chakri:@" + ":vasu:@" + ":naveen:@"
				+ ":sairam:@:siva:@:naveen:@:kumari:@:naina:@:nani";
		System.out.println(name.contains(":"));
		String replaced=name.replace(":", "*");		
		System.out.println(replaced);
		String doller=replaced.replace("*", "$");
		System.out.println(doller);
		String[] splitname = name.split("@");
		int count = 0;
		for (int i = 0; i < splitname.length; i++) {
			String str = splitname[i];

			if (str.contains(":")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
