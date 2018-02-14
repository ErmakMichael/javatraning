package com.intexsoft.lessons0612;

public class StrBuild {

	public static void main(String[] args) {

		String str = "I study Java";
		
		StringBuffer strBulder = new StringBuffer(str);

		strBulder.append(" and English too");
		
		System.out.println(strBulder);
	}

}
