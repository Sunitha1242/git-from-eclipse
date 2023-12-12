package com.cg.business;

import java.util.TreeMap;

public class CharacterClass {

	public static void main(String[] args) {
//		String s1 = "SpringBoot";// JavaEE
//		System.out.println(s1.length());
//		//System.out.println( s1.charAt(3));
//		Map<String, Integer> map = new HashMap();
//		int count = 0;
//		 map.put(s1,count);
//		 for(int i=0;i<s1.length();i++) {
//		 if(map.containsKey(map))
//			 map.get

		String str = "SPRRING BOOOT";
		TreeMap<Character, Integer> hMap = new TreeMap<>();
		//for (int i = str.length() - 1; i >= 0; i--) {
		for(int i=0;i<str.length();i++) {
			if (hMap.containsKey(str.charAt(i))) {
				int count = hMap.get(str.charAt(i));
				hMap.put(str.charAt(i), ++count);
			} else {
				hMap.put(str.charAt(i), 1);
			}
		}
		System.out.println(hMap);
	}

}
