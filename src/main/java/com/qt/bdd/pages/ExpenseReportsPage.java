package com.qt.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseReportsPage extends BasePage{
	WebDriver driver;

	public ExpenseReportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/reports']")
	private WebElement expenseReportsTab;
	
	@FindBy(xpath = "//span[text()='Add Report']/..")
	private WebElement addReportBtn;
	
	
	public void clickOnExpenseReportsPageTab() {
		expenseReportsTab.click();
	}
	
	public void clickOnAddReportBtn() throws Exception {
		Thread.sleep(5000);
		addReportBtn.click();
	}
}
