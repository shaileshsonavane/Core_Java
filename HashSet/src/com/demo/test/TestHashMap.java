package com.demo.test;
import java.util.HashMap;
import com.demo.test.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Map<String,Integer> s=new HashMap<>();
		
		s.put ("one", 111);
		s.put("Two", 222);
		s.put("Three", 333);
		s.put("Four",  444);
		
		//System.out.println(s);
		System.out.println("Value of one = " +s.get("one"));
		
	int num=222;
	 
	Set<String> a=s.keySet();
	for(String b:a)
	{
		if(s.get(b)>num)
		{
			System.out.println(b);
		}
	}

   	 
    Set<Map.Entry <String,Integer>> sr=s.entrySet();
    
    for(Map.Entry<String,Integer> entry:sr ) {
		if(entry.getValue()>num) {
			System.out.println(entry.getKey());
		}
       
	}
    Map<String,Integer> b=new TreeMap<>(s);
	System.out.println(b);
	

}
}