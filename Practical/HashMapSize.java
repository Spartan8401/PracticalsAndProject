package com.Practical;

import java.util.HashMap;
import java.util.Map;

public class HashMapSize {
	public static void main(String[] args) {
		HashMap<Integer, String> hash_Map=new HashMap<Integer, String>();
		hash_Map.put(1, "Red");
		hash_Map.put(2, "Green");
		hash_Map.put(3, "Pink");
		hash_Map.put(4, "Black");
		hash_Map.put(5, "White");
		
		 System.out.println("Size of the hash map: "+hash_Map.size());

}
}
