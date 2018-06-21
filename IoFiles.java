package com.cts.core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IoFiles {

	public static void main () {
		try{
	OutputStream fout = new FileOutputStream("./input/new.txt");
	fout.write(25);
	fout.close();
	System.out.println("written");
	}
		catch(Exception e){System.out.println("error"+ e);}
		
	}
}
