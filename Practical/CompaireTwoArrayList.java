package com.Practical;

import java.util.ArrayList;

public class CompaireTwoArrayList {
	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("White");
		c1.add("Black");
		c1.add("Pink");
		c1.add("Yellow");
		
		ArrayList<String> c2=new ArrayList<String>();
		c2.add("Red");
		c2.add("White");
		c2.add("Black");
		c2.add("Green");
		c2.add("Yellow");
		
		
		 ArrayList<String> c3 = new ArrayList<String>();
         for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
         System.out.println(c3);
		
	}

}
