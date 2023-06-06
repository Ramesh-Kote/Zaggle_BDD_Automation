package com.qt.stepdefinitions;

import com.qt.bdd.pages.ExpensesPage;
import com.qt.bdd.utils.TestContext;

import io.cucumber.java.en.When;

public class ExpensePageStepsDef {
	TestContext testContext;
	
	ExpensesPage expensesPage;

	public ExpensePageStepsDef(TestContext context) {
		testContext = context;
		expensesPage = testContext.getPageObjectManager().getexpensesPage();
	}

	@When("I clicked on the Expense tab")
	public void i_clicked_on_the_Expense_tab() {
		expensesPage.clickOnExpensesTab();
	}
	
	
	@When("I verify the expense details {string} {string} {string}")
	public void I_verify_the_expense_details(String totalAmount,String purposevalue,String commnts) {
		expensesPage.validateExpenseDetails(totalAmount, purposevalue, commnts);
	}
	
	
}
