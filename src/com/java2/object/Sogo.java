package com.java2.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.Scanner;

public class Sogo {
	

	public static void main(String[] args) {
		Sogo sogo = new Sogo();
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int function =0;
		showFunction();
		while (function != 3) {
		function = scanner.nextInt();
		switch(function) {
	
		case 1:
			inputSales();
			break;
		case 3:
			return;
		}}
		}
		public static void inputSales() {
			Scanner scanner = new Scanner(System.in);
			try {
				FileOutputStream fos;
				fos = new FileOutputStream("sales.txt");
				PrintStream out  = new PrintStream(fos);
				System.out.print("輸入會員等級：");
				int type = scanner.nextInt();
				System.out.print("印出銷售報表：");
				int amount = scanner.nextInt();
				out.print(type+ "\t" + amount);
				out.flush();
				out.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
					
		}
		public static void showFunction() {
		System.out.println("請輸入功能(1~3):");
		System.out.println("1) 輸入銷售紀錄");
		System.out.println("2) 印出銷售報表");
		System.out.println("3) 結束程式");
	}

}
