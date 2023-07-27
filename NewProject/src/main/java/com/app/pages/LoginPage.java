package com.app.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		this.driver = driver;
	}
	
	
	public void OpenURL(WebDriver driver, String url) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		driver.get(url);
	}
	
}
