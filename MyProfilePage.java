package com.TMS.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

	WebDriver driver;	
	
	@FindBy(xpath="/html/body/app-root/app-trainerprofile/div/div/div/div[2]/div[1]/div[2]/table")
	private WebElement table;

	
	
	
	
	
	public MyProfilePage(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}

	
	
	public List<String> getTable()  throws InterruptedException{
		Thread.sleep(3000);
		// create a new ArrayList
		List<String> listnew = new ArrayList<String>();
		List<WebElement> list = table.findElements(By.tagName("td"));
		for (WebElement item : list) {
			if(!item.getText().equals(":"))
	    	 {
				listnew.add(item.getText());
	    	 }
			
		 }
		
		return  listnew;
		
	
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
