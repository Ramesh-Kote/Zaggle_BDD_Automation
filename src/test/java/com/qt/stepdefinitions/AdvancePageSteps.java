package com.qt.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qt.bdd.pages.AdvancePage;
import com.qt.bdd.pages.HomePage;
import com.qt.bdd.pages.LoginPage;
import com.qt.bdd.utils.FileReaderManager;
import com.qt.bdd.utils.TestContext;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvancePageSteps {
	TestContext testContext;
	HomePage homePage;
	WebDriver driver;
	LoginPage loginPage;
	AdvancePage advancepage;
	
	public AdvancePageSteps(TestContext context) {

		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		loginPage = testContext.getPageObjectManager().getLoginPage();
		driver = testContext.getDriverManager().getDriver();
		advancepage= testContext.getPageObjectManager().getAdvancePage();

	}
	@When("I clicked on the Advance tab")
	public void i_clicked_on_the_advance_tab() {
		/*
		 * loginPage.navigateTo_LoginPage();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * loginPage.LogIn_Action(FileReaderManager.getInstance().getConfigReader().
		 * getUserName(),
		 * FileReaderManager.getInstance().getConfigReader().getPassword());
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 */
		advancepage.clickOnAdvanceTab();
		
	}
	
	@Then("I observe cash advance  and click on trip id hyperlink")
	public void i_observe_cash_advance_and_click_on_trip_id_hyperlink() {
		advancepage.clickOnTravelAdvance();
		advancepage.clickontripid();
	    
	}
	@Then("I observe details {string} {string} {string} {string} {string} and close the tab")
	public void i_observe_details_and_close_the_tab(String tripid, String travellername, String reasonfortravel, String startdate, String enddate) {
	   Assert.assertEquals(advancepage.getTripId(),tripid);
	   Assert.assertEquals(advancepage.getTravellerName(),travellername);
	   Assert.assertEquals(advancepage.getReasonforTravel(),reasonfortravel);
	   Assert.assertEquals(advancepage.getTripStartDate(),startdate);
	   Assert.assertEquals(advancepage.getTripEndDate(),enddate);
	   advancepage.clickOnCloseButton();
	}
	
	@Then("I  click on create advance hyperlink and observe details {string} {string} {string} {string}")
	public void i_click_on_create_advance_hyperlink_and_observe_details(String advancetripiid, String days, String advanceamount, String additionalamount) {
		advancepage.clickOnCreateAdvance();
		Assert.assertEquals(advancepage.getAdvanceTripId(),advancetripiid);
		Assert.assertEquals(advancepage.getDays(),days);
		Assert.assertEquals(advancepage.getAdvanceAmount(),advanceamount);
		Assert.assertEquals(advancepage.getAdditionalAmount(),additionalamount);
	}
	@Then("I click on {string} in mode and preferred currency")
	public void i_click_on_in_mode_and_preferred_currency(String string) {
		Assert.assertEquals(advancepage.getModeandPreferredCurrency(),string);
	}

	@Then("I changed currency to {string} and entered amount {string}")
	public void i_changed_currency_to_and_entered_amount(String currency, String amount) {
		Assert.assertEquals(advancepage.getcurrency(),currency);
		Assert.assertEquals(advancepage.getenteredmoney(),amount);
	}

	@Then("I verified whether checkbox is enabled and clicked on {string} button and {string} button")
	public void i_verified_whether_checkbox_is_enabled_and_clicked_on_button_and_button(String savebutton, String submitbutton) {
	    advancepage.clickoncheckbox();
	    Assert.assertEquals(advancepage.clickonsavebutton(),savebutton);
	    Assert.assertEquals(advancepage.clickonsubmitbutton(),submitbutton);
	    
	}
	@Then("I closed the tab")
	public void i_closed_the_tab() {
	    advancepage.clickonclosebutton();
	}
	
	@Then("I clicked on the Travel Advance sub tab")
	public void I_clicked_on_the_Travel_Advance_sub_tab() {
		advancepage.clickOnTravelAdvance();
			    
	}
	
	@Then("I clicked on the CreateAdvanceColumn")
	public void I_clicked_on_the_CreateAdvanceColumn() {
		advancepage.clickOnCreateAdvanceColumn();
			    
	}


}
