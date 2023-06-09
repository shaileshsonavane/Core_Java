package com.demo.test;

import java.util.HashSet;
import java.util.Set;

public class TestHastSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hs= new HashSet<>();
		hs.add(15);
		hs.add(12);
		hs.add(17);
		hs.add(14);
		hs.add(11);
		hs.add(11);
		hs.add(16);
		hs.forEach(c->System.out.println(c));

	}

}
