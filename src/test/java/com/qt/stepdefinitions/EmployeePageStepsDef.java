package com.qt.stepdefinitions;

import com.qt.bdd.pages.EmployeePage;
import com.qt.bdd.utils.TestContext;

import io.cucumber.java.en.When;

public class EmployeePageStepsDef {
	TestContext testContext;
	
	EmployeePage employeePage;

	public EmployeePageStepsDef(TestContext context) {
		testContext = context;
		
		employeePage = testContext.getPageObjectManager().getEmployeePage();
	}

	@When("I clicked on the EmployeeTab")
	public void i_clicked_on_the_EmployeeTab(){
		employeePage.clickOnemployeeTab();
	}
	
	
	@When("I clicked on the managementReports")
	public void i_clicked_on_the_managementReports(){
		employeePage.clickOnmanagementReports();
	}
}
