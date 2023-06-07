package com.qt.bdd.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BasePage{

	WebDriver driver;
	CommonPage commonPage;
	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[span[text()='Create Workflow']]")
	private WebElement createWorkFlow ;
	@FindBy(xpath = "//i[@aria-label='icon: close']")
	private WebElement crossIcon ;
	@FindBy(xpath = "(//button[span[text()='Action']])[1]")
	private WebElement actionBtn ;
	@FindBy(xpath = "//div[@class='ant-tabs-tab' and text()='Advance Payment Workflow']")
	private WebElement advancePaymentWorkflowSubTab ;
	@FindBy(xpath = "//button[span[text()='Add Category']]")
	private WebElement addCategory ;
	
	public void ValidateLinksInAdminPage() {
		
		
		List<WebElement> tot_count=driver.findElements(By.xpath("//ul[@class='ant-list-items']/li"));
		for(WebElement ele:tot_count) {
			
			if(ele.getText().equalsIgnoreCase("Approval Workflow")) {
				
				ele.click();
				commonPage.verifyLinks();
				createWorkFlow.click();
				commonPage.verifyLinks();
				crossIcon.click();
				actionBtn.click();
				commonPage.verifyLinks();
				advancePaymentWorkflowSubTab.click();
				commonPage.verifyLinks();
				createWorkFlow.click();
				commonPage.verifyLinks();
				crossIcon.click();
			}
			
			else if(ele.getText().equalsIgnoreCase("Business Information")) {
				
				ele.click();
				commonPage.verifyLinks();
				
			}
			
          else if(ele.getText().equalsIgnoreCase("Categories")) {
				
				ele.click();
				commonPage.verifyLinks();
				addCategory.click();
				crossIcon.click();
				
			}
			
          else if(ele.getText().equalsIgnoreCase("Cost Centres")) {
				
				ele.click();
				commonPage.verifyLinks();
				addCategory.click();
				crossIcon.click();
				
			}
		}
		
	}
}
