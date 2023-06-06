package com.qt.bdd.pages;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='/dashboard'])[2]")
	private WebElement dashboardTab;
	@FindBy(xpath = "//input[@placeholder='Select date']/..//child::i")
	private WebElement transactionDate;

	@FindBy(xpath = "//input[@placeholder='Enter report title']")
	private WebElement reportName;
	@FindBy(xpath = "//div[text()='Select Policy']/../..//child::span[@class='ant-select-arrow']")
	private WebElement poly;
	@FindBy(xpath = "//input[@placeholder='Start date']/../..//following-sibling::i[@aria-label='icon: calendar']")
	private WebElement duration ;
	@FindBy(xpath = "//div[text()='Select Category']/../../..//child::i")
	private WebElement category ;

	@FindBy(xpath = "//li[text()='Airfare (Self) Class 1 City']")
	private WebElement categoryitem ;
	@FindBy(xpath = "//input[@placeholder='Amount']")
	private WebElement amount ;
	@FindBy(xpath = "(//div[@role='combobox']/../../..//child::i)[5]")
	private WebElement purpose ;
	@FindBy(xpath = "//li[text()='Company']")
	private WebElement purposeItem ;
	@FindBy(xpath = "//textarea[@placeholder='Add comments (Mandatory)']")
	private WebElement comments ;

	@FindBy(xpath = "//button[@type='submit']/span")
	private WebElement saveBtn ;
	@FindBy(xpath = "//button[@type='button']/span[text()='OK']")
	private WebElement OKbtn ;
	@FindBy(xpath = "(//i[@aria-label='icon: file-text'])[1]")
	private WebElement addExpense ;
	@FindBy(xpath = "(//i[@aria-label='icon: file-text'])[2]")
	private WebElement addReports ;
	@FindBy(xpath = "//div[@class=' ant-tabs-tab']")
	private WebElement addMileage ;
	@FindBy(xpath = "//span[text()='Using Geo Location']")
	private WebElement usingGeoLocationSubTab ;
	@FindBy(xpath = "//span[text()='Odometer']")
	private WebElement OdometerSubTab ;


	public void clickOnDashboardTab() {
		dashboardTab.click();
	}

	public void addExpenseDetails(String category_value,String amount_value,String purpose_value,String comments_value) {
		addExpense.click();      
		transactionDate.click();     
		long millis = System.currentTimeMillis();   
		Date date = new Date(millis);  
		String s=date.toString();
		String[] S=s.split(" ");
		int number = Integer.parseInt(S[2]); 
		String xapth= S[1]+" "+(number-1)+","+" "+S[5];
		System.out.println(S[1]+" "+(number-1)+","+" "+S[5]);       
		driver.findElement(By.xpath("//td[@title='"+xapth+"'")).click();

		category.click();
		driver.findElement(By.xpath("//td[@title='"+category_value+"'")).click();
		amount.sendKeys(amount_value);
		purpose.click();

		driver.findElement(By.xpath("//li[text()='"+category_value+"'")).click();       
		comments.sendKeys(comments_value);
		saveBtn.click();
		OKbtn.click();       
	}

	public void clickOnaddExpense() {
		addExpense.click();  		
	}

	public void clickOnReports() throws Exception {
		Thread.sleep(5000);
		addReports.click();  		
	}
	public void clickOnAddMileage() throws Exception{
		Thread.sleep(5000);

		addMileage.click();
	}

	public void clickOnusingGeoLocationSubTab(){

		usingGeoLocationSubTab.click();
	}
	public void clickOnOdometerSubTab(){

		OdometerSubTab.click();
	}
}






