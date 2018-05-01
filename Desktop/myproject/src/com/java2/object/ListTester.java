package com.java2.object;

import java.awt.List;
import java.util.ArrayList;

public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("deleting number" + list.remove(0));
		System.out.println(list.size());
		//有多少個
		System.out.println(list.get(0));
		//編號從0開始對應的數字
	}

}
