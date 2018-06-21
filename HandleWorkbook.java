package com.cts.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleWorkbook  {

	public void create() throws Exception{
		
		try {
			System.out.println("create a sheet");
			XSSFWorkbook wb=new XSSFWorkbook();
			File f = new File("Workbook.xlsx");
			FileOutputStream out = new FileOutputStream(f);
			wb.write(out);
			out.close();
			
			
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void read(){}
	public void write(){
		
	}
	//main
	public static void main(String []args) throws Exception{
		/*HandleWorkbook obj = new HandleWorkbook();
		obj.create();*/
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		File f = new File("Workbook.xlsx");
		FileOutputStream out = new FileOutputStream(f);
		workbook.write(out);
		out.close();
		}
}
