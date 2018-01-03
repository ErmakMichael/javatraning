package com.intexsoft.lessons0301.task30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Test {

	public static void main(String[] args) throws IOException {

		String filePath = "D:\\ermakMichael\\Text.txt";

		List<String> lines = Files.readAllLines(Paths.get(filePath));

		int wordCount = 0;

		for (String line : lines) {

			System.out.println(line);
			String[] split = line.split(" ");
			wordCount += split.length;

		}
		System.out.println("\nWords count: " + wordCount);
	}

}
