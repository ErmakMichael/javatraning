package com.intexsoft.lessons0301;

import java.io.File;
import java.io.IOException;

public class FileSample {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\ermakMichael\\new.txt");

		System.out.println("File exists: " + file.exists());

		if (file.exists()) {

			System.out.println("File has been created before.");

		} else {

			file.createNewFile();
			//file.mkdirs();   создание директории
			System.out.println("File created.");
		}
	}
}
