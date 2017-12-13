package com.intexsoft.lessons1312;

import java.util.ArrayList;
import java.util.List;

public class SupresWarn {

	public void go() {

		@SuppressWarnings("rawtypes")
		List a = new ArrayList();

		@SuppressWarnings("unused")
		int i = 0;

	}
}
