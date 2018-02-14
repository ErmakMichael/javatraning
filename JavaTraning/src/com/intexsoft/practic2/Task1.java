package com.intexsoft.practic2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {

		String str = "0x7FFF <p> 0x7AAF <p> kkkk  khg gkhjg\r\n"
				+ "Exception in thread \"main\" java.util.regex.PatternSyntaxException: Illegal Unicode escape sequence near index 2\r\n"
				+ "\\uhhhh\r\n" + "  ^\r\n" + "	at java.util.regex.Pattern.error(Pattern.java:1924)\r\n"
				+ "	at java.util.regex.Pattern.uxxxx(Pattern.java:3182)\r\n"
				+ "	at java.util.regex.Pattern.u(Pattern.java:3190)\r\n"
				+ "	at java.util.regex.Pattern.escape(Pattern.java:2397)\r\n"
				+ "	at java.util.regex.Pattern.atom(Pattern.java:2164)\r\n"
				+ "	at java.util.regex.Pattern.sequence(Pattern.java:2046)\r\n"
				+ "	at java.util.regex.Pattern.expr(Pattern.java:1964)\r\n"
				+ "	at java.util.regex.Pattern.compile(Pattern.java:1665)\r\n"
				+ "	at java.util.regex.Pattern.<init>(Pattern.java:1337)\r\n"
				+ "	at java.util.regex.Pattern.compile(Pattern.java:1022)\r\n"
				+ "	at Mod2_2_3.main(Mod2_2_3.java:12) 1";

		Pattern p = Pattern.compile("[0-9,A-F]X");
		Matcher m = p.matcher(str);
		while (m.find()) {

			System.out.print(" " + m.group());

		}

	}

}
