package com.intexsoft.practic2;

public class Task2 {

	public static void main(String[] args) {

		String str = "hsdlgdsklgkl <p fdsfds> daskljd  <p> dfs";

		
		
		System.out.println(str.replaceAll("<p[^>]*>", "<p>"));

	}

}
