package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream out = new PrintStream("data.txt");
		out.print("yu shun lin\t1\t1ooo");
		out.flush();
		out.close();
	}

}
