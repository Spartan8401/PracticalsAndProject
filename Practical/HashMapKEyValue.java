package com.Practical;

import java.util.HashMap;
import java.util.Map;

public class HashMapKEyValue {
	public static void main(String[] args) {
		HashMap<Integer, String> hash_Map=new HashMap<Integer, String>();
		hash_Map.put(1, "Red");
		hash_Map.put(2, "Green");
		hash_Map.put(3, "Pink");
		hash_Map.put(4, "Black");
		hash_Map.put(5, "White");
		
		for(Map.Entry x:hash_Map.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
	}

}
