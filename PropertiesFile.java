package com.cts.core;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void readFile() throws IOException{
		String x = "";
		String y = "";
		String z = "";
		Properties p = new Properties();
		FileReader fr= new FileReader("./config.properties");
		p.load(fr);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		x = p.getProperty("username");
		y = p.getProperty("password");
		z = p.getProperty("EmpID");
		System.out.println("username and password is :-"+" "+x+" "+y +" "+z  );
		
	}
	
	public static void writeFile() throws IOException{
		String x = "";
		String y = "";
		Properties p = new Properties();
		//FileReader fr= new FileReader("./config.properties");
		//fr.read();
		FileWriter fw = new FileWriter("./config.properties", true);
		p.setProperty("EmpID", "554484");	
		p.store(fw,null);
	}
	
	public static void main (String []args) throws IOException{
		PropertiesFile.readFile();
		PropertiesFile.writeFile();
	}
}
