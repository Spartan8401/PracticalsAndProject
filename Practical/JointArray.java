package com.Practical;

import java.util.ArrayList;

public class JointArray {
	
	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("White");
		c1.add("Black");
		c1.add("Pink");
		c1.add("Yellow");
		System.out.println("First Array List:"+c1);
		
		ArrayList<String> c2=new ArrayList<String>();
		c2.add("Red");
		c2.add("White");
		c2.add("Black");
		c2.add("Green");
		c2.add("Yellow");
		System.out.println("First Array List:"+c2);
	
		ArrayList<String> c=new ArrayList<String>();
		c.addAll(c1);
		c.addAll(c2);
		System.out.println("All Array List Is:"+c);
	}	

}
