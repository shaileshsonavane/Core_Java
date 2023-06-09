package com.demo.test;

import java.util.Map;

import java.util.HashMap;

public class TestHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String,Integer> sr=new HashMap();
        
        sr.put("null",null);
        sr.put("aniket",null);
        sr.put("omkar",30);
        sr.put("Ganesh",40);
        sr.remove("null");
        System.out.println(sr);
        System.out.println(sr);
        if(!sr.containsKey("Deepak"))
			sr.put("shailu", 50);
        System.out.println(sr);
	}

}
