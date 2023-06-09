package com.qt.stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qt.bdd.utils.TestContext;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	TestContext testContext;
	WebDriver driver;

	public Hooks(TestContext context) {
		testContext = context;
		driver = testContext.getDriverManager().getDriver();
	}

	@Before
	public void setUp() {
		System.out.println("Setting up driver");
//		setup database connection...
	}

	@AfterStep(order = 1)
	public void addScreenshot(Scenario scenario) throws IOException {
		/*
		 * if(scenario.isFailed()) { File screenshot = ((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.FILE); byte[] fileContent =
		 * FileUtils.readFileToByteArray(screenshot); scenario.attach(fileContent,
		 * "image/png", "screenshot"); }
		 */
		
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); byte[] fileContent =
		FileUtils.readFileToByteArray(screenshot); scenario.attach(fileContent, "image/png", "screenshot");
	}

	@After
	public void tearDown() {
		System.out.println("Quitting driver");
		testContext.getDriverManager().quitDriver();
	}
}