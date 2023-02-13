package com.Practical;

import java.util.HashSet;

public class NumberOfHashSet {

	public static void main(String[] args) {
		HashSet<String> h_Set=new HashSet<>();
		h_Set.add("Red");
		h_Set.add("Yellow");
		h_Set.add("Green");
		h_Set.add("White");
		h_Set.add("Pink");
	
		System.out.println("Original Hash Set:"+h_Set);
		System.out.println("Size Of Hash Set:"+h_Set.size());
	}
}
