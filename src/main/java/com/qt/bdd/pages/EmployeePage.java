package com.qt.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage extends BasePage{
	WebDriver driver;

	public EmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[span[text()='Employees']]")
	private WebElement employeeTab ;
	@FindBy(xpath = "//a[span[text()='Management Reports']]")
	private WebElement managementReports ;
	
	public void clickOnemployeeTab(){

		employeeTab.click();
	}
	
	public void clickOnmanagementReports(){

		managementReports.click();
	}
}






