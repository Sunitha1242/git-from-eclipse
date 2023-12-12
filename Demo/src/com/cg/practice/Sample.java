package com.cg.practice;

import java.util.*;

//import javax.swing.text.html.Option;
public class Sample {
	public static void main(String args[]) {

		String str =null;
		Optional<String> opt = Optional.of(str);
		if(opt.isPresent())
		System.out.println("The value is " + opt.get());
		
	}

}
