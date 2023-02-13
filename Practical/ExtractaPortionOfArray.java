package com.Practical;

import java.util.ArrayList;
import java.util.List;

public class ExtractaPortionOfArray {
	public static void main(String[] args) {
		List<String> list_String=new ArrayList<>();
		list_String.add("Red");
		list_String.add("White");
		list_String.add("Yellow");
		list_String.add("Black");
		list_String.add("Pink");
		System.out.println("Before Reverse:"+list_String);
	    List<String> sub_String=list_String.subList(0, 3);
	    System.out.println("Sub String"+sub_String);
	}

}
