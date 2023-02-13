package com.Practical;

import java.util.HashMap;

public class CheckKeyValue {
	public static void main(String[] args) {
		HashMap<Integer, String> hash_Map=new HashMap<Integer, String>();
		hash_Map.put(1, "Red");
		hash_Map.put(2, "Green");
		hash_Map.put(3, "Pink");
		hash_Map.put(4, "Black");
		hash_Map.put(5, "White");
		
       boolean result=hash_Map.isEmpty();
       System.out.println("Is Hash MAp Emplty:"+result);
       
       hash_Map.clear();
       result= hash_Map.isEmpty();
       System.out.println("Is Hash MAp Emplty:"+result);
       
       
}

}
