package com.collection.practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("apples");
		list.add("oranges");
		list.add("grapes");
		list.add("grapes");
		System.out.println(list);
		for(String li:list)
		{
			//list.add("guava");
			System.out.println("From LIST::" + li);
		}
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Set<String> set=new HashSet<>();
		set.add("carrot");
		set.add("brinjal");
		set.add("peas");
		set.add("cabbage");
		set.add("cabbage");
		for(String st:set)
		{
			
			System.out.println("From SET::" + st);
		}
		

	}

}
