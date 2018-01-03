package com.intexsoft.lessons0301.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("D:\\ermakMichael\\Text.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("D:\\ermakMichael\\Text.txt"));

		System.out.println(in.readLine());

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		System.out.println("+" + str);
		
		
		
	}

}
