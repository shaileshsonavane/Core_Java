package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMapDemo {
	public static void main(String args[]) {
		Map<String,Integer> hm= new HashMap<>();
		hm.put("Chemical", 60);
		hm.put("Mechanical",200);
		hm.put("IT", 100);
		hm.put("Computer", 100);
		
		Set<String> k = hm.keySet();
		for(String a :k) {
			System.out.println(hm.get(a));
		}
		
	}

}
