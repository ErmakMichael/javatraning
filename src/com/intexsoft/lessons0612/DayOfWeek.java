package com.intexsoft.lessons0612;

public enum DayOfWeek {
	
	monday("��"),
	tuesday("��"),
	wednesday("��"),
	thursday("��"),
	friday("��"),
	saturday("��"),
	sunday("��");
	
	
	private DayOfWeek(String titleRu) {
		
		this.titleRu = titleRu;
		
	}
	private String titleRu;
	
	String getTitleRu() {
		return titleRu;
	}
	
	
	//
	
	

}
