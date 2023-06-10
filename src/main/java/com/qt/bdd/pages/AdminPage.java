package com.qt.bdd.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qt.bdd.utils.TestContext;

public class AdminPage extends BasePage {

	WebDriver driver;
	TestContext testContext;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[span[text()='Create Workflow']]")
	private WebElement createWorkFlow;
	@FindBy(xpath = "(//button[span[text()='Create Workflow']])[2]")
	private WebElement createWorkFlow1;
	@FindBy(xpath = "//button[@aria-label='Close']//i[@class='anticon anticon-close ant-modal-close-icon']")
	private WebElement crossIcon;
	@FindBy(xpath = "(//button[span[text()='Action']])[1]")
	private WebElement actionBtn;
	@FindBy(xpath = "//div[text()='Advance Payment Workflow']")
	private WebElement advancePaymentWorkflowSubTab;
	@FindBy(xpath = "//button[span[text()='Add Category']]")
	private WebElement addCategory;
	@FindBy(xpath = "(//button[span[text()='Edit']])[1]")
	private WebElement edit;
	@FindBy(xpath = "//div[text()='Manage Cost Centers']")
	private WebElement manageCostCenters;
	@FindBy(xpath = "//div[text()='Cost Object Approver']")
	private WebElement costObjectApprover;
	@FindBy(xpath = "//button[span[text()='Add Fields']]")
	private WebElement addFields;
	@FindBy(xpath = "//div[text()='Employee Master']")
	private WebElement employeeMaster;
	@FindBy(xpath = "//div[text()='Advance Payment']")
	private WebElement advancePayment;
	@FindBy(xpath = "//div[text()='Report Header']")
	private WebElement reportHeader;
	@FindBy(xpath = "//div[text()='Connected Lists']")
	private WebElement connectedLists;
	@FindBy(xpath = "//button[span[text()='Add Employee Grades']]")
	private WebElement addEmployeeGrades;
	@FindBy(xpath = "//button[span[text()='Add Bulk Employee Grade']]")
	private WebElement addBulkEmployeeGrade;
	@FindBy(xpath = "//button[span[text()='Add New Organization']]")
	private WebElement addNewOrganization;
	@FindBy(xpath = "//button[span[text()='Add Merchant']]")
	private WebElement addMerchant;
	@FindBy(xpath = "//button[span[text()='Add Mileage Rate']]")
	private WebElement addMileageRate;
	@FindBy(xpath = "//button[span[text()='Add Rate']]")
	private WebElement addRate;
	@FindBy(xpath = "//button[span[text()='Add Project']]")
	private WebElement addProject;
	@FindBy(xpath = "//button[span[text()='Add Bulk Projects']]")
	private WebElement addBulkProjects;
	@FindBy(xpath = "//div[text()='Online Reimbursements']")
	private WebElement onlineReimbursements;
	@FindBy(xpath = "//button[span[text()='Add Roles']]")
	private WebElement addRoles;
	@FindBy(xpath = "//button[span[text()='Add Currency']]")
	private WebElement addCurrency;
	@FindBy(xpath = "//button[span[text()='Add New Tax']]")
	private WebElement addNewTax;
	@FindBy(xpath = "//div[text()='GST Settings']")
	private WebElement gSTSettings;
	@FindBy(xpath = "//button[span[text()='Add New GST']]")
	private WebElement addNewGST;
	@FindBy(xpath = "//button[span[text()='Integrate']]")
	private WebElement Integrate;
	@FindBy(xpath = "//div[text()='Dispatch Address Link']")
	private WebElement dispatchAddressLink;
	@FindBy(xpath = "//div[text()='Pro-rata Loading']")
	private WebElement prorataLoading;

	@FindBy(xpath = "//a[@href='/admin']")
	private WebElement adminTab;
	@FindBy(xpath = "//button[span[text()='Add Cost Centre']]")
	private WebElement addCostCentre;

	@FindBy(xpath = "//button[span[text()='Cancel']]")
	private WebElement cancelBtn;
	@FindBy(xpath = "//button[span[text()='Close']]")
	private WebElement closeBtn;
	@FindBy(xpath = "//button[span[text()='CANCEL']]")
	private WebElement CANCELBtn;
	public void clickOnAdminTab() {
		adminTab.click();

	}

	public void ValidateLinksInAdminPage(CommonPage commonPage) throws Exception {

		List<WebElement> tot_count = driver.findElements(By.xpath("//ul[@class='ant-list-items']/li"));
		for (WebElement ele : tot_count) {

			if (ele.getText().equalsIgnoreCase("Approval Workflow")) {

				ele.click();
				commonPage.verifyLinks();
				createWorkFlow.click();
				commonPage.verifyLinks();
				crossIcon.click();
				actionBtn.click();
				commonPage.verifyLinks();
				Thread.sleep(3000);
				advancePaymentWorkflowSubTab.click();
				commonPage.verifyLinks();
				Thread.sleep(3000);
				createWorkFlow1.click();
				commonPage.verifyLinks();
				crossIcon.click();
			}

			else if (ele.getText().equalsIgnoreCase("Business Information")) {

				ele.click();
				commonPage.verifyLinks();

			}

			else if (ele.getText().equalsIgnoreCase("Categories")) {

				ele.click();
				Thread.sleep(3000);
				commonPage.verifyLinks();
				Thread.sleep(3000);
				addCategory.click();
				crossIcon.click();

			}

			else if (ele.getText().equalsIgnoreCase("Cost Centres")) {

				ele.click();
				commonPage.verifyLinks();
				addCostCentre.click();
				crossIcon.click();
				edit.click();
				commonPage.verifyLinks();
				crossIcon.click();
				manageCostCenters.click();
				commonPage.verifyLinks();
				costObjectApprover.click();
				commonPage.verifyLinks();

			}

			else if (ele.getText().equalsIgnoreCase("Data Fields")) {
				ele.click();
				commonPage.verifyLinks();
				addFields.click(); 
				commonPage.verifyLinks(); 	
				CANCELBtn.click();				
				Thread.sleep(3000);
				edit.click(); 
				commonPage.verifyLinks(); 
				CANCELBtn.click();
				 
				employeeMaster.click();
				commonPage.verifyLinks();
				advancePayment.click();
				Thread.sleep(3000);
				commonPage.verifyLinks();
				reportHeader.click();
				commonPage.verifyLinks();
				connectedLists.click();

			}


			else if (ele.getText().equalsIgnoreCase("Employee Grades")) {
				ele.click();
				commonPage.verifyLinks();
				addEmployeeGrades.click();
				commonPage.verifyLinks();
				crossIcon.click();
				edit.click();
				commonPage.verifyLinks();
				crossIcon.click();
				addBulkEmployeeGrade.click();
				commonPage.verifyLinks();

			}

			else if (ele.getText().equalsIgnoreCase("Employees")) {

				continue;

			}

			else if (ele.getText().equalsIgnoreCase("Manage Organization")) {

				ele.click();
				commonPage.verifyLinks();

				addNewOrganization.click(); 
				commonPage.verifyLinks();
				Thread.sleep(3000);
				cancelBtn.click();


			}

			else if (ele.getText().equalsIgnoreCase("Merchants")) {

				ele.click();
				commonPage.verifyLinks();
				addMerchant.click();
				commonPage.verifyLinks();
				crossIcon.click();
				edit.click();
				commonPage.verifyLinks();
				crossIcon.click();

			}

			else if (ele.getText().equalsIgnoreCase("Mileage Rate")) {

				ele.click();
				commonPage.verifyLinks();

				addMileageRate.click(); 
				commonPage.verifyLinks(); 
				closeBtn.click();

				edit.click();
				commonPage.verifyLinks(); 
				closeBtn.click();


			} else if (ele.getText().equalsIgnoreCase("Per Diem")) {

				ele.click();
				commonPage.verifyLinks();
				addRate.click();
				commonPage.verifyLinks();
				crossIcon.click();
			}

			else if (ele.getText().equalsIgnoreCase("Policies & Limits")) {

				ele.click();
				commonPage.verifyLinks();

			}

			else if (ele.getText().equalsIgnoreCase("Projects")) {

				ele.click();
				commonPage.verifyLinks();
				addProject.click();
				commonPage.verifyLinks();
				crossIcon.click();
				edit.click();
				commonPage.verifyLinks();
				crossIcon.click();
				addBulkProjects.click();
				commonPage.verifyLinks();

			}

			else if (ele.getText().equalsIgnoreCase("Reimbursements")) {

				ele.click();
				commonPage.verifyLinks();

				addFields.click(); 
				Thread.sleep(5000);
				cancelBtn.click();

				advancePayment.click();
				commonPage.verifyLinks();
				onlineReimbursements.click();
				commonPage.verifyLinks();
			}

			else if (ele.getText().equalsIgnoreCase("Roles")) {

				ele.click();
				commonPage.verifyLinks();
				addRoles.click();
				commonPage.verifyLinks();

				closeBtn.click(); 
				edit.click(); 
				commonPage.verifyLinks(); 
				closeBtn.click();

			}

			else if (ele.getText().equalsIgnoreCase("Subscriptions")) {

				continue;
			}

			else if (ele.getText().equalsIgnoreCase("Custom Emails/Notifications")) {

				ele.click();
				commonPage.verifyLinks();
			}

			else if (ele.getText().equalsIgnoreCase("Multi-Currency")) {

				ele.click();
				commonPage.verifyLinks();
				addCurrency.click();
				commonPage.verifyLinks();
				crossIcon.click();
				edit.click();
				commonPage.verifyLinks();
				crossIcon.click();
			}

			else if (ele.getText().equalsIgnoreCase("Preferences & Settings")) {

				ele.click();
				commonPage.verifyLinks();

			} else if (ele.getText().equalsIgnoreCase("Signature")) {

				ele.click();
				commonPage.verifyLinks();

			} else if (ele.getText().equalsIgnoreCase("Taxes")) {

				ele.click();
				commonPage.verifyLinks();
				/*
				 * addNewTax.click(); commonPage.verifyLinks(); crossIcon.click();
				 */
				gSTSettings.click();
				commonPage.verifyLinks();
				/*
				 * addNewGST.click(); commonPage.verifyLinks();
				 */
				// crossIcon.click();

			}


			else if(ele.getText().equalsIgnoreCase("Integrations")) {

				ele.click(); commonPage.verifyLinks(); Integrate.click();
				commonPage.verifyLinks();

			}


			else if (ele.getText().equalsIgnoreCase("Zinger Card Settings")) {
				Thread.sleep(5000);
				ele.click();
				commonPage.verifyLinks();
				dispatchAddressLink.click();
				commonPage.verifyLinks();
				prorataLoading.click();
				commonPage.verifyLinks();

			}
		}

	}
}
