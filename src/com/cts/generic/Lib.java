package com.cts.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Lib {

	public static String getCellValue(String path, String sheet, int r, int c){
		String v = "";
		try{
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
	}
	catch(Exception e){
	}
	return v;
	}
	
	public static void writeToPresentCell(String path, String sheet, int r, int c, String value ){
		try{
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		wb.getSheet(sheet).createRow(r).createCell(c).setCellValue(value);
		}
		catch(Exception e){
			
		}
	}
	
	public static void writeToCell(String path, String sheet, int r, int c, String value ){
		try{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		 Sheet sh = wb.createSheet(sheet);
		 sh.createRow(r).createCell(c).setCellValue(value);
		 wb.write(new FileOutputStream(path));
		}
		catch(Exception e){
			
		}
	}
		
		public static void tutorialsPoint()throws Exception {
		      //Create Blank workbook
		      XSSFWorkbook workbook = new XSSFWorkbook();
			

		      //Create file system using specific name
		      FileOutputStream out = new FileOutputStream(new File("./Data/createworkbook.xlsx"));

		      //write operation workbook using file out object 
		      workbook.write(out);
		      out.close();
		      System.out.println("createworkbook.xlsx written successfully");
		   }

		
		
		
		
		
		
		
		
	}
	

