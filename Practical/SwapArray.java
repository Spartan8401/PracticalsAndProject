package com.Practical;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArray {
	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("White");
		c1.add("Black");
		c1.add("Pink");
		c1.add("Yellow");
		
		System.out.println("Before Swaping: "+c1);
		
		Collections.swap(c1, 0, 2);
		System.out.println("After Swaping: "+c1);
		
		
		
	}
		

}
