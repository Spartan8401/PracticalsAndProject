package com.Practical;

import java.util.HashMap;
import java.util.HashSet;

public class HashTOArray {
	
	public static void main(String[] args) {
		HashSet<String> h_Set=new HashSet<>();
		h_Set.add("Red");
		h_Set.add("Yellow");
		h_Set.add("Green");
		h_Set.add("White");
		h_Set.add("Pink");
		System.out.println("HashSet Arrau is:"+h_Set);
	
		String[] new_array=new String[h_Set.size()];
		h_Set.toArray(new_array);
		
		System.out.println("Array Element:");
		for(String element : new_array) {
			System.out.println(element);
		}
	}

}
