package com.cg.ui;

import java.io.File;
import java.io.FileFilter;

public class FileLamdaClass {

	public static void main(String[] args) {

//		FileFilter filter=new FileFilter() {
//
//			@Override
//			public boolean accept(File pathname) {
//				return pathname.getName().endsWith(".java");
//			}
//		};
//		
		FileFilter filter=(File pathName)->pathName.getName().endsWith(".java");
		
		
		
		File dir=new File("C:\\Users\\sumuddan\\eclipse-workspace\\CG1\\src");
		 File[] files = dir.listFiles(filter);
		 for(File f:files) {
			 System.out.println(f);
		 }
	}
}
			
		
	


