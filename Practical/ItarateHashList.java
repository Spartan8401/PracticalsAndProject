package com.Practical;

import java.util.HashSet;
import java.util.Iterator;

public class ItarateHashList {

	public static void main(String[] args) {
		HashSet<String> h_Set=new HashSet<>();
		h_Set.add("Red");
		h_Set.add("Yellow");
		h_Set.add("Green");
		h_Set.add("White");
		h_Set.add("Pink");
		
		Iterator<String> p=h_Set.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
	}
}
