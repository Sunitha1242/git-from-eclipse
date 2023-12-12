package com.Java8.practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Sorting1 {

	public static void main(String[] args) {
		List<Integer> al = new LinkedList<>();
		Map<Integer,String> ts = new TreeMap<>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
		//
		al.add(12);
		al.add(90);
		al.add(33);
		al.add(42);
		al.add(42);
		al.add(9);
		al.add(16);
//		hs.add(12);
//		hs.add(90);
//		hs.add(33);
//		hs.add(42);
//		hs.add(42);
//		hs.add(9);
//		hs.add(16);
		ts.put(100,"Sunitha");
		ts.put(200,"Ramani");
		ts.put(300,"Sunitha");
		ts.put(400,"Lasya");
		ts.put(500,"Lucky");
		ts.put(250,"Hari");
		ts.put(100,"Sweety");

		System.out.println("ArrayList before Sorting:: " +al);
		System.out.println(ts);
		//Collections.sort(al,new Sorting1());
		Collections.sort(al,(o1,o2)->o1>o2?-1:o1<o2?1:0);

		System.out.println("ArrayList after Sorting:: " +al);



	}

	

}
