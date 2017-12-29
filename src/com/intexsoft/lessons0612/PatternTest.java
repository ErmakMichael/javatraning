package com.intexsoft.lessons0612;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(" +- +");				//обертка regex
		
		Matcher matcher = p.matcher("Test - string - test");
		while (matcher.find()) {								//find() переходит по совпадением
			
			System.out.println(matcher.start() + " - " + matcher.end());  //
		}
		
		
		
		
		
		
	}

}
