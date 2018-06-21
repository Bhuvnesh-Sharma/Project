package com.cts.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoFiles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStream fin =  new FileInputStream("./input/new.txt");
			
			while(fin.read()!=-1){
				System.out.println();
				
			}
		}catch(Exception e){System.out.println("error"+ e);}
		
		
		try{
			OutputStream fout = new FileOutputStream("./input/new.txt");
			
			fout.write(23);
			
			
			fout.close();
			System.out.println("written");
			}
				catch(Exception e){System.out.println("error"+ e);}
				
			}
	
	
	
	
	}


