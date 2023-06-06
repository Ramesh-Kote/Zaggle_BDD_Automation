package com.qt.stepdefinitions;

import com.qt.bdd.pages.CommonPage;
import com.qt.bdd.pages.TravelRequestPage;
import com.qt.bdd.utils.TestContext;

import io.cucumber.java.en.When;

public class TravelRequestPageStepsDef {
	TestContext testContext;
	CommonPage commonPage;
	TravelRequestPage travelRequestPage;

	public TravelRequestPageStepsDef(TestContext context) {
		testContext = context;
		commonPage = testContext.getPageObjectManager().getCommonPage();
		travelRequestPage = testContext.getPageObjectManager().getTravelRequestPage();
	}

	@When("I clicked on the TravelRequest tab")
	public void i_clicked_on_the_TravelRequest_tab() {
		travelRequestPage.clickOnTravelRequestTab();
	}
	
	@When("I clicked on the AddNewRequest button")
	public void i_clicked_on_the_AddNewRequest_button() throws Exception {
		travelRequestPage.clickOnaddNewRequestBtn();
	}
	
}
