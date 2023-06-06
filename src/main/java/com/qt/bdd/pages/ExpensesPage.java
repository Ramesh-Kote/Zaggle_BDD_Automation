package com.qt.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ExpensesPage extends BasePage{
	WebDriver driver;

	public ExpensesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/user-expenses']")
	private WebElement expensesTab;
	
	@FindBy(xpath = "//span[text()='Ex-ID']/../../../../../..//tr[3]/td[2]")
	private WebElement firstcolumn_ex_id;
	
	@FindBy(xpath = "//span[text()='Total Amount']/..")
	private WebElement totalAmont;
	@FindBy(xpath = "//span[text()='Purpose']/..")
	private WebElement purpose;
	@FindBy(xpath = "//span[text()='Comments']/..")
	private WebElement comments;
	
	public void clickOnExpensesTab() {
		expensesTab.click();
	}
	
	public void validateExpenseDetails(String totalAmount,String purposevalue,String commnts) {
		firstcolumn_ex_id.click();
		String actualamount=totalAmont.getText();
		Assert.assertEquals(actualamount, totalAmount);
		String actualpurpose=purpose.getText();
		Assert.assertEquals(actualpurpose, purpose);
		String actualcomments=comments.getText();
		Assert.assertEquals(actualcomments, commnts);
		
	}
}
