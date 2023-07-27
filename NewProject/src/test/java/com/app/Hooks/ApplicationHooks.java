package com.app.Hooks;

import io.cucumber.java.BeforeAll;

public class ApplicationHooks {

	@BeforeAll
	public static void testHooks() {
		System.out.println("In Hooks");
	}
	
}
