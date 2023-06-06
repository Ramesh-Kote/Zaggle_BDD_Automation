package com.qt.bdd.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TravelExpensesPage extends BasePage{

	WebDriver driver;

	public TravelExpensesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath = "//a[@href='/advance-payment']")
	private WebElement advanceTab;

	@FindBy(xpath = "//div[@class=' ant-tabs-tab']")
	private WebElement travelAdvanceTab;

	@FindBy(xpath = "(//span[text()='Create Advance ' and @role='presentation'])[1]")
	private WebElement createAdvance;

	@FindBy(xpath = "//span[text()='TA12112200600000CA1']")
	private WebElement tripIDLink;

	@FindBy(xpath = "//a[@href='/travel-log']")
	private WebElement travalExpencesesTab;


	@FindBy(xpath = "//a[@href='/expense-trips']")
	private WebElement travalExpenceTab;


	@FindBy(xpath="//span[text()='Expense Trip '][1]")
	private WebElement ExpenseTrip;

	@FindBy(xpath="//span[text()=' Add Trip to Report']/..")
	private WebElement addTriptoReport;

	@FindBy(xpath=" //span[text()='Yes']/..")
	private WebElement yesBtn;

	@FindBy(xpath="//input[@value='domestic']")
	private WebElement domesticRadioBtn;

	@FindBy(xpath=" //span[text()='Next']/..")
	private WebElement nextBtn;

	public void clickOnAddTripReport() throws Exception {
		addTriptoReport.click();
		Thread.sleep(3000);
		yesBtn.click();
		Thread.sleep(3000);
		domesticRadioBtn.click();
		Thread.sleep(3000);
		nextBtn.click();

	}
	public List<WebElement> getTravalExpensesHeaderColumns() {

		return driver.findElements(By.xpath("//table[@class='ant-table-fixed']//tr//th"));
	}


	public List<WebElement> getTravalExpensesHeaderRows() {

		return driver.findElements(By.xpath("//table[@class='ant-table-fixed']//tbody//tr"));
	}


	public List<String> verifyTravalExpensesHeaderColumnsAndData() {

		List<String> headers = new ArrayList<String>();

		List<String> firstRecord = new ArrayList<String>();

		int columnsSize = getTravalExpensesHeaderColumns().size();

		int rowsSize  = getTravalExpensesHeaderRows().size();

		// print header and courses
		for (int i = 0; i < rowsSize; i++) {

			System.out.println();
			if(i==2)
				break;

			for (int j = 0; j < columnsSize; j++) {

				if (i == 0) {

					headers.add(getTravalExpensesHeaderColumns().get(j).getText());

					//System.out.print(getTravalExpensesHeaderColumns().get(j).getText() + "     ");


				}


			}

		}

		return headers;
	}


	public List<String> verifyTravalExpensesHeaderFirstRecordData() {

		List<String> headers = new ArrayList<String>();

		List<String> firstRecord = new ArrayList<String>();

		int columnsSize = getTravalExpensesHeaderColumns().size();

		int rowsSize  = getTravalExpensesHeaderRows().size();

		// print header and courses
		for (int i = 0; i < rowsSize; i++) {

			System.out.println();
			if(i==2)
				break;

			for (int j = 0; j < columnsSize; j++) {

				if (i == 0) {

					headers.add(getTravalExpensesHeaderColumns().get(j).getText());

					//System.out.print(getTravalExpensesHeaderColumns().get(j).getText() + "     ");


				}

				else {
					String xpath = String.format("//table[@class='ant-table-fixed']/tbody/tr[%d]/td[%d]",i + 1, j + 1);

					firstRecord.add(driver.findElement(By.xpath(xpath)).getText());


				}

			}

		}

		return firstRecord;
	}

	public void clickOnAdvanceTab() {
		object_Click(advanceTab);
	}

	public void clickOnTravelAdvance() {
		travelAdvanceTab.click();
	}

	public void clickOnCreateAdvance() {
		object_Click(advanceTab);
	}	


	public void clickOnTripID() {
		object_Click(tripIDLink);
	}	

	public void clickOnTravalExpence() {
		object_Click(travalExpenceTab);
	}

	public void clickonExpenseTrip() {
		ExpenseTrip.click();
	}


	public void navigateTotripId(String tripId) {

		driver.findElement(By.xpath("//span[text()='"+tripId+"']")).click();

	}

	public Map<String,String> verifyTripIdDetails() {

		List<String> headers=new ArrayList<>(); 
		List<String> values=new ArrayList<>(); 

		Map<String,String> hm=new HashMap<String,String>();			
		List<WebElement> tot_headers=driver.findElements(By.xpath("//strong[@class='margin-b-1']"));
		List<WebElement> tot_values=driver.findElements(By.xpath("//strong[@class='margin-b-1']/following::div[1]"));

		for(WebElement header:tot_headers) {

			headers.add(header.getText());

		}
		for(WebElement value:tot_values) {

			values.add(value.getText());

		}

		for(int i=0;i<headers.size();i++) {

			for(int j=0;j<1;j++) {
				hm.put(headers.get(i), values.get(i));				

			}			
		}

		return hm;

	}

}
