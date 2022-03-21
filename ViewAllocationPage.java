package com.TrainerManSys2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllocationPage {
	
	WebDriver driver;
	
	public ViewAllocationPage(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[3]/a")
    private WebElement viewallocation;
	
	@FindBy(xpath="/html/body/app-root/app-viewallocation/div[2]/div[1]/input")
	private WebElement search;
	
	@FindBy(xpath="/html/body/app-root/app-viewallocation/div[2]/div[1]/input")
	private WebElement searchdata;
	

	
	public void clickViewAllocation() throws InterruptedException{
		Thread.sleep(4000);
		viewallocation.click();
	}
	
	public void clickSearch() throws InterruptedException{
		Thread.sleep(4000);
		viewallocation.click();
	}
	
	public void setSearchData(String strSearchdata){ 
		searchdata.sendKeys(strSearchdata); 
		}
}
