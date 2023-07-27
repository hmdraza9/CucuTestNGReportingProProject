package com.app.stepDefs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;

import com.app.pages.LoginPage;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepDef {

	private static WebDriver driver;
	public final static int TIMEOUT = 10;
	LoginPage objLoginPage = new LoginPage(driver);
	public Scenario scenario;


	@Given("user is on app login page {string}")
	public void userIsOnLoginPage(String url) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		driver.get(url);
	}

	@Then("user navigates to {string}")
	public void userNavigatesToPage(String url) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		objLoginPage.OpenURL(getDriver(), url);
	}

	@Then("User logs into the system")
	public void userLogsIntoSystem() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println("Title" + driver.getTitle());
	}

	@Then("User logs out the system")
	public void userLogsOutTheSystem() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		
		Assert.assertTrue(true);
	}

	public static void tearDown() throws IOException {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println("***************Kill Browser***************");
		if (driver != null) {
			driver.quit();
		}
	}
	public static void ts(Scenario scenario) throws IOException {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File scrFile = screenshot.getScreenshotAs(OutputType.FILE);
		String currScrPath = System.getProperty("user.dir") + "/Screenshots/" + scenario.getName().substring(0, 10)
				+ "Screenshot" + "_" + timePrint() + ".png";
		File currScr = new File(currScrPath);
		FileUtils.copyFile(scrFile, currScr);
		BufferedImage bimb = ImageIO.read(currScr);
		int height = bimb.getHeight();
		int width = bimb.getWidth();
		Reporter.log("<br><img src='" + currScrPath + "' height='" + height + "' width='" + width + "'/></br>");
		byte[] fileContent = FileUtils.readFileToByteArray(currScr);
		scenario.attach(fileContent, "image/png", scenario.getName());
	}

	public static String timePrint() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMMyyyy_HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now).toString();
	}

	public static WebDriver getDriver() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		if(driver==null) {

			System.out.println("***************Set up Browser***************");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
//			options.addArguments("--headless");
//			options.addArguments("headless");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
			driver.manage().window().maximize();
			System.out.println("Driver if driver==null : "+driver);
		}
		System.out.println("Driver if not null: "+driver);
		try {
			driver.manage().window().maximize();
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
			driver = null;
			getDriver();
		}
		return driver;
	}
	@BeforeStep
	public void scenarioUp(Scenario scenario) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		this.scenario = scenario;
	}

	@AfterStep
	public void takeScreenshot(Scenario scenario) throws IOException {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		ts(scenario);
	}

}
