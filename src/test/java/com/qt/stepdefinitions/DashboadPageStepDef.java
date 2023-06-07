package com.qt.stepdefinitions;

import com.qt.bdd.pages.DashboardPage;
import com.qt.bdd.utils.TestContext;

import io.cucumber.java.en.When;


public class DashboadPageStepDef {
	TestContext testContext;
	DashboardPage dashboardPage;

	public DashboadPageStepDef(TestContext context) {
		testContext = context;
		dashboardPage = testContext.getPageObjectManager().getDashboardPage();
	}

	@When("I clicked on the dashboard tab")
	public void i_clicked_on_the_dashboard_tab() {
		dashboardPage.clickOnDashboardTab();
	}	
	
	@When("I created the added expense {string} {string} {string} {string}")
	public void I_created_the_added_expense(String catagory,String amount,String purpose,String comments) {
		dashboardPage.addExpenseDetails(catagory,amount,purpose,comments);
	}
	
	@When("I clicked on the AddExpense")
	public void i_clicked_on_the_AddExpense() {
		dashboardPage.clickOnaddExpense();
	}
	
	@When("I clicked on the AddReport")
	public void i_clicked_on_the_AddReport() throws Exception {
		
		dashboardPage.clickOnReports();
	}
	
	@When("I clicked on the AddMileage")
	public void i_clicked_on_the_AddMileage() throws Exception{
		dashboardPage.clickOnAddMileage();
	}
	
	@When("I clicked on the usingGeoLocationSubTab")
	public void i_clicked_on_the_usingGeoLocationSubTab(){
		dashboardPage.clickOnusingGeoLocationSubTab();
	}
	
	@When("I clicked on the clickOnOdometerSubTab")
	public void i_clicked_on_the_clickOnOdometerSubTab(){
		dashboardPage.clickOnOdometerSubTab();
	}
	
	@When("I clicked on the viewReportsandSummarySubTab")
	public void i_clicked_on_the_viewReportsandSummarySubTab(){
		dashboardPage.clickOnviewReportsandSummarySubTab();
	}
	@When("I clicked on the inviteEmployeeAddAdminSubTab")
	public void i_clicked_on_the_inviteEmployeeAddAdminSubTab(){
		dashboardPage.clickOninviteEmployeeAddAdminSubTab();
	}
	
	@When("I clicked on the configureSettingsSubTab")
	public void i_clicked_on_the_configureSettingsSubTab(){
		dashboardPage.clickOnconfigureSettingsSubTab();
	}
	
	@When("I clicked on the addNewBtn")
	public void i_clicked_on_the_addNewBtn(){
		dashboardPage.clickOnaddNewBtn();
	}
	@When("I clicked on the manageBtn")
	public void i_clicked_on_the_manageBtn(){
		dashboardPage.clickOnmanageBtn();
	}
	@When("I clicked on the documentsSubTab")
	public void i_clicked_on_the_documentsSubTab(){
		dashboardPage.clickOndocumentsSubTab();
	}
	@When("I clicked on the bulkUploadSubTab")
	public void i_clicked_on_the_bulkUploadSubTab(){
		dashboardPage.clickOnbulkUploadSubTab();
	}
	
	@When("I clicked on the CrossIcon")
	public void i_clicked_on_the_CrossIcon(){
		dashboardPage.clickOnCrossIcon();
	}
}