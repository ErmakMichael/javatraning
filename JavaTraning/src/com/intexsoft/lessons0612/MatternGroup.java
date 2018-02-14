package com.intexsoft.lessons0612;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatternGroup {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("www\\.(\\w+)\\.by");
		Matcher matcher = pattern.matcher("    www.tut.by    ");

		matcher.find();
		System.out.println(matcher.group(0)); ////0 или 1
	}

}
