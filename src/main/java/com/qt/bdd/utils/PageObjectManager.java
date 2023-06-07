package com.qt.bdd.utils;

import org.openqa.selenium.WebDriver;

import com.qt.bdd.pages.AdvancePage;
import com.qt.bdd.pages.BasePage;
import com.qt.bdd.pages.CommonPage;
import com.qt.bdd.pages.DashboardPage;
import com.qt.bdd.pages.EmployeePage;
import com.qt.bdd.pages.ExpenseReportsPage;
import com.qt.bdd.pages.ExpensesPage;
import com.qt.bdd.pages.HomePage;
import com.qt.bdd.pages.LoginPage;
import com.qt.bdd.pages.TravelAllowances;
import com.qt.bdd.pages.TravelExpensesPage;
import com.qt.bdd.pages.TravelRequestPage;

public class PageObjectManager {

	private WebDriver driver;

	private HomePage homePage;

	private LoginPage loginPage;

	private TravelExpensesPage travelExpencesPage;
	
	private TravelAllowances travelAllowancesPage;
	
	private AdvancePage advancepage;
	
	private CommonPage commonPage;
	
	private DashboardPage dashboardPage;
	
	private ExpensesPage expensesPage;
	
	private ExpenseReportsPage expenseReportsPage;
	private TravelRequestPage travelRequestPage;
	private EmployeePage employeePage;
	
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
		BasePage.basePageDriver(driver);

	}

	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}

	public LoginPage getLoginPage() {

		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

	}


	public TravelExpensesPage getTravelExpensesPage() {

		return (travelExpencesPage == null) ? travelExpencesPage = new TravelExpensesPage(driver) : travelExpencesPage;

	}

	public TravelAllowances getTravelAllowancesPage() {

		return (travelAllowancesPage == null) ? travelAllowancesPage = new TravelAllowances(driver) : travelAllowancesPage ;
	}

	public AdvancePage getAdvancePage() {

		return (advancepage == null) ? advancepage = new AdvancePage(driver) : advancepage ;
	}

	public CommonPage getCommonPage() {

		return (commonPage == null) ? commonPage = new CommonPage(driver) : commonPage ;
	}

	public DashboardPage getDashboardPage() {

		return (dashboardPage == null) ? dashboardPage = new DashboardPage(driver) : dashboardPage ;
	}
	
	public ExpensesPage getexpensesPage() {

		return (expensesPage == null) ? expensesPage = new ExpensesPage(driver) : expensesPage ;
	}
	public ExpenseReportsPage getExpenseReportsPage() {

		return (expenseReportsPage == null) ? expenseReportsPage = new ExpenseReportsPage(driver) : expenseReportsPage ;
	}

	public TravelRequestPage getTravelRequestPage() {

		return (travelRequestPage == null) ? travelRequestPage = new TravelRequestPage(driver) : travelRequestPage ;
	}
	
	public EmployeePage getEmployeePage() {

		return (employeePage == null) ? employeePage = new EmployeePage(driver) : employeePage ;
	}

}