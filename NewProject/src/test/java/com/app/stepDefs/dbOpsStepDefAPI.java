package com.app.stepDefs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.app.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class dbOpsStepDefAPI {

	private static WebDriver driver;
	public final static int TIMEOUT = 10;
	LoginPage objLoginPage = new LoginPage(driver);


	@Then("^user multiplies \"(.*)\" and \"(.*)\"$")
	public void userMultipliesTwoNumbers(String num1, String num2) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		num1 = num1.replace("<", "").replace(">", "");
		num2 = num2.replace("<", "").replace(">", "");
		System.out.println("Number 1: "+num1+"; Number 2: "+num2);
		System.out.println("Multiplication of numbers Number 1: "+num1+"; Number 2: "+num2+" is: "+Integer.parseInt(num1)*Integer.parseInt(num2));
	}

	@Then("tests pipe separated params")
	public void testsPipeSeparatedParams(DataTable dataTable) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println("Before transpose: "+dataTable);
		dataTable.transpose();
		System.out.println("After transpose: "+dataTable);
		System.out.println("dataTable.height(): "+dataTable.height());
		List<String> data = dataTable.asList(String.class);
		for(String str : data) {
			System.out.println("Data value: "+str);
		}
		
	}

	public static String timePrint() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMMyyyy_HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now).toString();
	}

}
