package com.Practical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	public static void main(String[] args) {
		List<String> list_String=new ArrayList<>();
		list_String.add("Red");
		list_String.add("White");
		list_String.add("Yellow");
		list_String.add("Black");
		list_String.add("Pink");
		System.out.println("Before Reverse:"+list_String);
		Collections.reverse(list_String);
		System.out.println("After Reverse:"+list_String);
		
	}

}
