package com.intexsoft.lessons0612.enum1;

public enum DayOfWeek {

	monday("��"), tuesday("��"), wednesday("��"), thursday("��"), friday("��"), saturday("��"), sunday("��");

	private String titleRu;

	private DayOfWeek(String titleRu) {
		this.titleRu = titleRu;

	}

	String getTitleRu() {
		return titleRu;
	}

	//

}
