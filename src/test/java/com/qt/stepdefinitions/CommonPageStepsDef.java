package com.qt.stepdefinitions;

import com.qt.bdd.pages.CommonPage;
import com.qt.bdd.pages.ExpensesPage;
import com.qt.bdd.utils.TestContext;

import io.cucumber.java.en.Then;

public class CommonPageStepsDef {
	TestContext testContext;
	CommonPage commonPage;
	ExpensesPage expensesPage;

	public CommonPageStepsDef(TestContext context) {
		testContext = context;
		commonPage = testContext.getPageObjectManager().getCommonPage();
		expensesPage = testContext.getPageObjectManager().getexpensesPage();
	}

	
	@Then("I verify the all links on the tabs")
	public void I_verify_the_all_links_on_the_tabs() throws Exception{
		Thread.sleep(2000);
		commonPage.verifyLinks();
		
	}
	
	@Then("I backward the page")
	public void I_backward_the_page(){
		
		commonPage.backward();
		
	}
	
}
