package com.qt.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.bdd.utils.FileReaderManager;

public class LoginPage extends BasePage{

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_LoginPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getHomePageUrl());
		
	}
	
	
	
	@FindBy(xpath = "ant-btn red-btn home-btn ant-btn margin-r-2 font-14")
	private	WebElement login;
	
	@FindBy(id = "normal_login_username")
    private  WebElement emailID;

	@FindBy(id = "normal_login_password")
	private	WebElement loginPassword;

	@FindBy(xpath = "//button[@class='ant-btn red-btn ant-btn-primary']")
	private	WebElement loginButton;

	public void LogIn_Action(String uName, String pwd) {
		
		driver.findElement(By.xpath("//button[@class='ant-btn red-btn home-btn ant-btn margin-r-2 font-14']")).click();
		//object_Click(login);
		emailID.sendKeys(uName);
		loginPassword.sendKeys(pwd);
		object_Click(loginButton);
	}
}
