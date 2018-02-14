package com.intexsoft.lessons0612;

public enum DayOfWeek {
	
	monday("пн"),
	tuesday("вт"),
	wednesday("ср"),
	thursday("чт"),
	friday("пт"),
	saturday("сб"),
	sunday("вс");
	
	
	private DayOfWeek(String titleRu) {
		
		this.titleRu = titleRu;
		
	}
	private String titleRu;
	
	String getTitleRu() {
		return titleRu;
	}
	
	
	//
	
	

}
