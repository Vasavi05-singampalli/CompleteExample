package com.example;

public class StringExample {
	protected void sub(){
		System.out.println("sub");
	}

	public static void main(String[] args) {
		String name="vasu::vasavi::chakri::sai::naveen::sairam::siva::naveen::kumari::naina::nani";
		String[] splitarray=name.split("::");
		
		int count=0;
		for (int i = 0; i < splitarray.length; i++) {			
			//System.out.println(splitarray[i]);
		String str=splitarray[i];
		if(str.equalsIgnoreCase(("naveen"))){
			count++;
		}
		//System.out.println(str);
		}
		System.out.println(count);
		//System.out.println(sa);
		//System.out.println(name.compareTo(name1));
		//String name3=new String("VASU");
		//System.out.println(name.compareToIgnoreCase(name3));
		//System.out.println(name.concat(name1));
		//System.out.println(name.contains("d"));
		//System.out.println(name.contentEquals(name3));
	}

}
