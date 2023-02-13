package com.Practical;

import java.util.ArrayList;

public class SecondElementChange {
	public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original array list: " + c1);
    
        String new_color = "White";
        c1.set(1,new_color);
        System.out.println("The New Array LIst"+c1);
	}
	

}
