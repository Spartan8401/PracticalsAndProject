package com.Practical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashsetToArrayList {
  
	public static void main(String[] args) {
		HashSet<String> h_Set=new HashSet<>();
		h_Set.add("Red");
		h_Set.add("Yellow");
		h_Set.add("Green");
		h_Set.add("White");
		h_Set.add("Pink");
		System.out.println("HashSet Arrau is:"+h_Set);
		
		List<String> list=new ArrayList<String>(h_Set);
		System.out.println("ArrayList Containts:"+list);
	
   }
}
