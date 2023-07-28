package com.app.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
//		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		this.driver = driver;
	}
	public void printTitle() {
		System.out.println("Title is : --> "+driver.getTitle());
	}
	

//	public void OpenURL(WebDriver driver, String url) {
	public void OpenURL(String url) {
//		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		driver.get(url);
	}
	
}
