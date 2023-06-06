package com.qt.bdd.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends BasePage{

	WebDriver driver;

	public CommonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Backward the page
	public void backward(){
		
		driver.navigate().back();
		
	}
	//Verify the broken links in the page
	public void verifyLinks(){
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		List<WebElement> tot_links = driver.findElements(By.tagName("a"));

		for(WebElement link:tot_links){

			url = link.getAttribute("href");

			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			/*if(!url.startsWith(homePage)){
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}*/

			try {
				huc = (HttpURLConnection)(new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if(respCode >= 400){
					System.out.println(url+" is a broken link:"+respCode);
				}
				else{
					System.out.println(url+" is a valid link:"+respCode);
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}

	
}
