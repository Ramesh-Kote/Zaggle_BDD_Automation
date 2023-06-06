package com.qt.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvancePage extends BasePage {

	WebDriver driver;
	
	public AdvancePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='/advance-payment']")
	private WebElement advanceTab;
	
	
	@FindBy(xpath = "//div[@class=' ant-tabs-tab']")
	private WebElement travelAdvanceTab;
	
	@FindBy(xpath = "(//span[text()='Create Advance ' and @role='presentation'])[1]")
	private WebElement createAdvance;
	
	@FindBy(xpath="//span[@class='cursor link' and text()='TA12INT1']")
	private WebElement tripidhyperlink;
	
	@FindBy(xpath="//div[@class='text-blue' and text()='TA12INT1']")
	private WebElement tripid;

	@FindBy(xpath="//div[text()='Mr Anvesh Reddy']")
	private WebElement Traveller;
	
	@FindBy(xpath="//div[text()='company']")
	private WebElement reasonfortravel;
	
	@FindBy(xpath="//div[text()='18 Nov 2022']")
	private WebElement tripstartdate;
	
	@FindBy(xpath="//div[text()='26 Nov 2022']")
	private WebElement tripenddate;
	

	@FindBy(xpath="//i[@class='anticon anticon-close ant-modal-close-icon']")
	private WebElement closeButton;
	
	@FindBy(xpath="//input[@class='ant-input ant-input-disabled' and  @id='create_advance_payment_trip_id']")
	private WebElement AdvanceTripId;
	
	@FindBy(xpath="//input[@class='ant-input ant-input-disabled' and  @id='create_advance_payment_no_of_days']")
	private WebElement Advance_days;
	
	@FindBy(xpath="//input[@class='ant-input ant-input-disabled' and  @id='create_advance_payment_per_diem_amount']")
	private WebElement Advance_amount;
	
	@FindBy(xpath="//input[@class='ant-input ant-input-disabled' and @id='create_advance_payment_additional_amount']")
	private WebElement additional_amount;
	
	@FindBy(xpath="//div[text()='Cash']")
	private WebElement modeandpreferredcurrency;
	
	@FindBy(xpath="//div[@class='ant-select-selection-selected-value' and text()='USD']")
	private WebElement currency;
	
	
	@FindBy(xpath="//input[@class='ant-input ant-input-disabled' and @id='create_advance_payment_mode[0].modeAmount']")
	private WebElement enteramount;
	
	@FindBy(xpath="//input[@class='ant-checkbox-input']")
	private WebElement checkbox;
	
	@FindBy(xpath="//span[text()='Save']")
	private WebElement savebutton;
	
	@FindBy(xpath="//span[text()='Submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//i[@class='anticon anticon-close ant-modal-close-icon']")
	private WebElement closebutton;
	@FindBy(xpath="(//span[@class='text-red cursor']/..)[1]")
	private WebElement createAdvancecolumn;
	
	
	public void clickOnAdvanceTab() {
		object_Click(advanceTab);
	}

	public void clickOnTravelAdvance() {
		travelAdvanceTab.click();
	}

	public void clickontripid() {
		object_Click(tripidhyperlink);
	}
	
	public String getTripId() {
		return tripid.getText();
	}
	
	public String getTravellerName() {
		return Traveller.getText();
	}
	
	public String getReasonforTravel() {
		return reasonfortravel.getText();
	}
	
	public String getTripStartDate() {
		return tripstartdate.getText();
	}
	
	public String getTripEndDate() {
		return tripenddate.getText();
	}
	
	public void clickOnCloseButton() {
		object_Click(closeButton);
	}
	public void clickOnCreateAdvance() {
		object_Click(createAdvance);
	}
	public String getAdvanceTripId () {
		return AdvanceTripId.getAttribute("Value");
	}
	public String getDays () {
		return Advance_days.getAttribute("Value");
	}
	public String getAdvanceAmount () {
		return Advance_amount.getAttribute("Value");
	}
	public String getAdditionalAmount () {
		return additional_amount.getAttribute("Value");
	}
	public String getModeandPreferredCurrency () {
		return modeandpreferredcurrency.getText();
	}
	public String getcurrency() {
		return currency.getText();
	}
	public String getenteredmoney() {
		return enteramount.getAttribute("value");
	}
	public void clickoncheckbox() {
		checkbox.isDisplayed();
	}
	public String clickonsavebutton() {
		return savebutton.getText();
	}
	public String clickonsubmitbutton() {
		return submitbutton.getText();
	}
	public void clickonclosebutton() {
		object_Click(closeButton);
	}
	public void clickOnCreateAdvanceColumn() {
		object_Click(createAdvancecolumn);
	}
}
