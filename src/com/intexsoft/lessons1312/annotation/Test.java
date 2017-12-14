package com.intexsoft.lessons1312.annotation;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {

		Class<? extends SampleObject> clazz = new SampleObject().getClass();

		Version annotation = clazz.getAnnotation(Version.class);
		System.out.println("SampleObject vers: " + annotation.info());

		Method[] methods = clazz.getMethods();

		for (Method method : methods) {
			Version methodVersion = method.getAnnotation(Version.class);
			
			String version = methodVersion == null ? "version unsupported" : methodVersion.info();
			

			System.out.println(String.format("method '%s' version: %s", method.getName(), version));
		}

	}

}
