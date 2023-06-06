package com.qt.bdd.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelAllowances extends BasePage{
WebDriver driver;
	
	public TravelAllowances(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h1[@class='margin-b-2 H1-s9tk2d6-0 bZARED']")
	private WebElement travelallowances;
	
	@FindBy(xpath="//strong[text()='Departure']")
	private WebElement Departure;
	
	@FindBy(xpath="//strong[text()='Return']")
	private WebElement Return;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-selected-value'])[1]")
	private WebElement Departure_location;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-selected-value'])[2]")
	private WebElement Return_location;
	
	@FindBy(xpath="(//input[@placeholder='Enter Departure Date-Time'])[1]")
	private WebElement DepartureTime;
	
	@FindBy(xpath="(//input[@placeholder='Enter Arrival Date-Time'])[1]")
	private WebElement ArrivalTime;
	

	@FindBy(xpath = "//button[@type='button']")
	private WebElement NextButton;
		
	@FindBy(xpath="//input[@placeholder='Days']")
	private WebElement Days;
	
	@FindBy(xpath="//input[@placeholder='Rate']")
	private WebElement Rate;
	
	@FindBy(xpath="//input[@placeholder='Amount']")
	private WebElement Amount;
	
	@FindBy(xpath="//div[@class='ant-table-content']//tr//td[3]")
	private WebElement Allowance;
	
	@FindBy(xpath="//button[@class='ant-btn margin-l-1 width-1 ant-btn-primary']")
	private WebElement nextbutton;
	
	@FindBy(xpath="//input[@placeholder='Enter report title' and @ id='normal_login_title']")
	private WebElement ReportName;
	
	@FindBy(xpath="//div[@class='ant-select-selection-selected-value' and @title='Domestic Policy']")
	private WebElement Policy;
	
	@FindBy(xpath="//strong[text()='1000.00']")
	private WebElement Amountreimbursed;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	private WebElement submitbutton;
	
	
	public String gettravelallowances() {
		return travelallowances.getText();
	}
	
	
	public String getDepartureText() {
		return Departure.getText();
	}
	
	public String getReturnText() {
		return Return.getText();
	}
	
	public String getDepartureLocation() {
		return Departure_location.getText();
	}
    
	public String getReturnLocation() {
		return Return_location.getText();
	}
	
	public String getDepartureTime() {
		return DepartureTime.getAttribute("value");
	}
	
	public String getArrivalTime() {
		return ArrivalTime.getAttribute("value");
	}
	public void clickonnextbutton() {
		NextButton.click();
	}
	
	public String getDays() {
		return Days.getAttribute("value");
	}
	
	public String getRate() {
		return Rate.getAttribute("value");
	}
	public String getAmount() {
		return Amount.getAttribute("value");
	}
	
	public String getAllowance() {
		return Allowance.getText();
	}
	
 public void clickonNextbutton() {
		nextbutton.click();
	}
	
	public String getReportName() {
		return ReportName.getAttribute("value");
	}
	
	public String getPolicy() {
		return Policy.getText();
	}
	public String getAmountreimbursed() {
		return Amountreimbursed.getText();
				
	}

	public void clickonsubmitbutton() {
		submitbutton.click();
	}
}