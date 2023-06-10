package com.qt.stepdefinitions;

import com.qt.bdd.pages.AdminPage;
import com.qt.bdd.pages.CommonPage;
import com.qt.bdd.utils.TestContext;

import io.cucumber.java.en.When;

public class AdminPageStepsDef{
	TestContext testContext;
	AdminPage adminPage;
	CommonPage commonPage;
	public AdminPageStepsDef(TestContext context) {
		testContext = context;
		commonPage = testContext.getPageObjectManager().getCommonPage();
		adminPage = testContext.getPageObjectManager().getAdminPage();
	}

	@When("I clicked on the Admin tab")
	public void i_clicked_on_the_ExpenseReoports_tab() {
		adminPage.clickOnAdminTab();
	}
	
	@When("I verify admin tab links")
	public void i_clicked_on_the_AddReport_button() throws Exception {
		adminPage.ValidateLinksInAdminPage(commonPage);
		
		
	}
	
}
