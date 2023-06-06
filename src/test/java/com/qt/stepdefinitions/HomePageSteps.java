package com.qt.stepdefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qt.bdd.pages.AdvancePage;
import com.qt.bdd.pages.HomePage;
import com.qt.bdd.pages.LoginPage;
import com.qt.bdd.pages.TravelAllowances;
import com.qt.bdd.pages.TravelExpensesPage;
import com.qt.bdd.utils.FileReaderManager;
import com.qt.bdd.utils.TestContext;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	TestContext testContext;
	HomePage homePage;
	WebDriver driver;
	LoginPage loginPage;
	TravelExpensesPage travelExpencesPage;
	TravelAllowances travelAllowancesPage;
	

	public HomePageSteps(TestContext context) {

		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		loginPage = testContext.getPageObjectManager().getLoginPage();
		driver = testContext.getDriverManager().getDriver();
		travelExpencesPage = testContext.getPageObjectManager().getTravelExpensesPage();
		travelAllowancesPage= testContext.getPageObjectManager().getTravelAllowancesPage();

	}

	@Given("I login as an admin user")
	public void i_login_as_an_admin_user() {
		loginPage.navigateTo_LoginPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginPage.LogIn_Action(FileReaderManager.getInstance().getConfigReader().getUserName(),
				FileReaderManager.getInstance().getConfigReader().getPassword());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("I verify all employee expenses options {string},{string},{string},{string},{string},{string}")
	public void i_verify_all_employee_expenses_options(String dashboard, String expenses, String travelRequest,
			String expenseReport, String travelExpenses, String advance) {

		Assert.assertEquals(homePage.getDashboardTabText(), dashboard);
		Assert.assertEquals(homePage.getExpensesText(), expenses);
		Assert.assertEquals(homePage.getTravalRequestText(), travelRequest);
		Assert.assertEquals(homePage.getExpenseReportText(), expenseReport);
		Assert.assertEquals(homePage.getTravalExpenseText(), travelExpenses);
		Assert.assertEquals(homePage.getAdvanceText(), advance);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("I clicked on the Travel Expense tab")
	public void i_clicked_on_the_travel_expense_tab() {
		homePage.clickOnTravalExpence();

	}

	@When("I verify Travel Expenses table Header {string} {string} {string} {string} {string} {string} {string} {string}")
	public void i_verify_travel_expenses_table_header(String tridID, String reportID, String reportDate,
			String destination, String startDate, String endDate, String travelCost, String action) {

		List<String> headersFromApplication = new ArrayList<String>();
		headersFromApplication = travelExpencesPage.verifyTravalExpensesHeaderColumnsAndData();
		System.out.println("list of headers" + headersFromApplication);
		Assert.assertEquals(headersFromApplication.get(0), tridID);
		Assert.assertEquals(headersFromApplication.get(1), reportID);
		Assert.assertEquals(headersFromApplication.get(2), reportDate);
		Assert.assertEquals(headersFromApplication.get(3), destination);
		Assert.assertEquals(headersFromApplication.get(4), startDate);
		Assert.assertEquals(headersFromApplication.get(5), endDate);
		Assert.assertEquals(headersFromApplication.get(6), travelCost);
		Assert.assertEquals(headersFromApplication.get(7), action);

	}
	
	@Then("I verify Travel data also {string} {string}     {string}     {string} {string} {string}")
	public void i_verify_travel_data_also(String tridID,
			String destination, String startDate, String endDate, String travelCost, String action) {
		List<String> firstRecordFromApplication = new ArrayList<String>();
		firstRecordFromApplication = travelExpencesPage.verifyTravalExpensesHeaderFirstRecordData();
		System.out.println("list of headers" + firstRecordFromApplication);
		Assert.assertEquals(firstRecordFromApplication.get(0), tridID);
		//Assert.assertEquals(headersFromApplication.get(1), reportID);
		//Assert.assertEquals(headersFromApplication.get(2), reportDate);
		Assert.assertEquals(firstRecordFromApplication.get(3), destination);
		Assert.assertEquals(firstRecordFromApplication.get(4), startDate);
		Assert.assertEquals(firstRecordFromApplication.get(5), endDate);
		Assert.assertEquals(firstRecordFromApplication.get(6).substring(2), travelCost);
		Assert.assertEquals(firstRecordFromApplication.get(7), action);
	  
	}
	
	
	@When("I clicked on Expense Trip hyperlink")
	public void i_clicked_on_expense_trip_hyperlink() {
		travelExpencesPage.clickonExpenseTrip();
	}
      
	@When("I verify whether {string} {string}  {string} is displayed")
	public void i_verify_whether_is_displayed(String string, String string2, String string3) {
		Assert.assertEquals(travelAllowancesPage.gettravelallowances(),string );
		Assert.assertEquals(travelAllowancesPage.getDepartureText(),string2);
		Assert.assertEquals(travelAllowancesPage.getReturnText(),string3);
		
	}
	@Then("I verify data {string} {string} {string} {string}")
	public void i_verify_data(String string, String string2,String string3,String string4) {
		Assert.assertEquals(travelAllowancesPage.getDepartureLocation(),string);
		 Assert.assertEquals(travelAllowancesPage.getReturnLocation(),string2);
		 Assert.assertEquals(travelAllowancesPage.getDepartureTime(),string3);
		 Assert.assertEquals(travelAllowancesPage.getArrivalTime(),string4);
	}
	

	
@Then("I clicked on Next button and observed per diem details {string} {string}")
public void i_clicked_on_next_button_and_observed_per_diem_details(String string, String string2) {
	travelAllowancesPage.clickonnextbutton();
    Assert.assertEquals(travelAllowancesPage.getDays(),string);
    Assert.assertEquals(travelAllowancesPage.getRate(),string2);
}

@Then("I clicked on Next button and Observe the details {string} {string}")
public void i_clicked_on_next_button_and_observe_the_details(String string, String string2) {
    travelAllowancesPage.clickonNextbutton();
    Assert.assertEquals(travelAllowancesPage.getReportName(), string);
    Assert.assertEquals(travelAllowancesPage.getPolicy(), string);
    
}


@Then("I observe Amount to be reimbursed \"{double}\"and click on submit")
public void i_observe_amount_to_be_reimbursed_and_click_on_submit(Double double1) {
	 Assert.assertEquals(travelAllowancesPage.getAmountreimbursed(),double1);
	    travelAllowancesPage.clickonsubmitbutton();
	
}

@Given("I login with_credentials {string} {string}")
public void i_login_with_credentials(String userName,String passWord) {
	loginPage.navigateTo_LoginPage();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	loginPage.LogIn_Action(userName,passWord);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

	
	

}
