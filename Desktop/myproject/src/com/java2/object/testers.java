package com.java2.object;

public class testers implements Destroyable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "NARUTO,One Piece,Detective Conan,SAKURA,Alive";
		// 將 line 字串以逗號分割，並存在 split_line 字串陣列中
		String[] split_line = line.split(",");
		String show_split_line = "";
		for (String s: split_line) {
		    show_split_line = show_split_line + "[" + s + "]";
		}
		System.out.println(show_split_line);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
