package com.qt.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelRequestPage extends BasePage{
	WebDriver driver;

	public TravelRequestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/travel-log']")
	private WebElement travelRequestTab;
	
	@FindBy(xpath = "//span[text()=' Add New Request']/..")
	private WebElement addNewRequestBtn;
	
	public void clickOnTravelRequestTab() {
		travelRequestTab.click();
	}
	public void clickOnaddNewRequestBtn() throws Exception {
		Thread.sleep(5000);
		addNewRequestBtn.click();
	}
}
