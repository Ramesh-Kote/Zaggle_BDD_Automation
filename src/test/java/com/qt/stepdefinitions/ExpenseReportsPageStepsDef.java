package com.qt.stepdefinitions;

import com.qt.bdd.pages.ExpenseReportsPage;
import com.qt.bdd.utils.TestContext;
import io.cucumber.java.en.When;

public class ExpenseReportsPageStepsDef {
	TestContext testContext;
	ExpenseReportsPage expenseReports;

	public ExpenseReportsPageStepsDef(TestContext context) {
		testContext = context;
		expenseReports = testContext.getPageObjectManager().getExpenseReportsPage();
	}

	@When("I clicked on the ExpenseReoports tab")
	public void i_clicked_on_the_ExpenseReoports_tab() {
		expenseReports.clickOnExpenseReportsPageTab();
	}
	
	@When("I clicked on the AddReport button")
	public void i_clicked_on_the_AddReport_button() throws Exception {
		expenseReports.clickOnAddReportBtn();
	}
	
}
