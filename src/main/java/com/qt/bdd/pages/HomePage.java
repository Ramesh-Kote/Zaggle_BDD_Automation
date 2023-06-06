package com.qt.bdd.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qt.bdd.utils.FileReaderManager;

public class HomePage extends BasePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Dismiss")
	private WebElement dismissBtn;

	@FindBy(xpath = "//span[text()='TA12INT1']")
	private WebElement tripIDLink;

	@FindBy(xpath = "//a[@href='/dashboard']//span")
	private WebElement dashboardTabText;

	@FindBy(xpath = "//a[@href='/user-expenses']//span")
	private WebElement expensesTabText;

	@FindBy(xpath = "//a[@href='/travel-log']//span")
	private WebElement travalRequestTab;

	@FindBy(xpath = "//a[@href='/reports']//span")
	private WebElement expenseReportTabText;

	@FindBy(xpath = "//a[@href='/expense-trips']//span")
	private WebElement travalExpenseTabText;

	@FindBy(xpath = "//a[@href='/advance-payment']//span")
	private WebElement advanceTabText;
	
	@FindBy(xpath = "//a[@href='/expense-trips']")
	private WebElement travalExpenseTab;
	
	
	
		
	public void dismiss_TestPage_info() {
		dismissBtn.click();
	}

	

	public void clickOnTripID() {
		object_Click(tripIDLink);
	}

	public void clickOnTravalExpence() {
		object_Click(travalExpenseTab);
	}

	public String getDashboardTabText() {
		return dashboardTabText.getText();
	}

	public String getExpensesText() {
		return expensesTabText.getText();
	}

	public String getTravalRequestText() {
		return travalRequestTab.getText();
	}

	public String getExpenseReportText() {
		return expenseReportTabText.getText();
	}

	public String getTravalExpenseText() {
		return travalExpenseTabText.getText();
	}

	public String getAdvanceText() {
		return advanceTabText.getText();
	}
	
	
}
