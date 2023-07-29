package com.app.stepDefs;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.app.pages.LoginPage;
import com.app.utils.Utilities;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageStepDef {

	private static WebDriver driver;
	public final static int TIMEOUT = 10;
	LoginPage objLoginPage = new LoginPage(Utilities.getDriver());
	public Scenario scenario;
	Logger log = LogManager.getFormatterLogger(LoginPageStepDef.class);

	@Given("user is on app login page {string}")
	public void userIsOnLoginPage(String url) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		log.info(new Throwable().getStackTrace()[0].getMethodName());
		objLoginPage.OpenURL(url);
	}

	@Then("user navigates to {string}")
	public void userNavigatesToPage(String url) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		log.info(new Throwable().getStackTrace()[0].getMethodName());
		objLoginPage.OpenURL(url);
		Utilities.ts(scenario);
	}

	@Then("User logs into the system")
	public void userLogsIntoSystem() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		log.info(new Throwable().getStackTrace()[0].getMethodName());
		objLoginPage.printTitle();
	}

	@Then("User logs out the system")
	public void userLogsOutTheSystem() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());

		Assert.assertTrue(true);
	}

//	public static WebDriver getDrivaer() {
//		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
//		if (driver == null) {
//
//			System.out.println("***************Set up Browser***************");
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--remote-allow-origins=*");
//			options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
////			options.addArguments("--headless");
////			options.addArguments("headless");
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver(options);
//			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
//			driver.manage().window().maximize();
////			System.out.println("Driver if driver==null : "+driver);
//		}
////		System.out.println("Driver if not null: "+driver);
//		try {
//			driver.manage().window().maximize();
//		} catch (NoSuchSessionException e) {
//			// TODO Auto-generated catch block
//			driver = null;
//			getDrivaer();
//		}
//		return driver;
//	}

	@BeforeStep
	public void BeforeStep(Scenario scenario) {
//		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		log.info(new Throwable().getStackTrace()[0].getMethodName());
		this.scenario = scenario;
	}

//	@AfterStep
//	public void takeScreenshot(Scenario scenario) throws IOException {
//		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
//		ts(scenario);
//	}

}
