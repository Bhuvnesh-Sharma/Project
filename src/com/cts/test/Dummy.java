package com.cts.test;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cts.generic.Lib;
public class Dummy {
	
	public static void main(String[] args) throws Exception {
		Lib.writeToCell("./Data/input.xlsx", "new", 0,0 , "Data");
		Lib.writeToCell("./Data/input.xlsx", "new", 0, 1, "value");
		Lib.tutorialsPoint();
		
//	public static void main(String[] args) {
//		for (int i=0; i>=1;i++){
//		String data = Lib.getCellValue("./Data/input.xlsx", "Valid", 0, i);
//		System.out.println(data);}
//	}
//	
//	
//	
//@Test
//public void excelTest(){
//	for (int i=0; i<=1;i++){
//		String data = Lib.getCellValue("./Data/input.xlsx", "Valid", 0, i);
//		Reporter.log(data,true);
//		//System.out.println(data);
//	}
//	}
//	  
//	 
}}





