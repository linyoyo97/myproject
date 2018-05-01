package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filetesters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		filetester();
		
	}
	public static void filetester() 
 {
		try {
			FileOutputStream out = new FileOutputStream("name.txt");
			out.write(65);
			out.write(85);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}}
