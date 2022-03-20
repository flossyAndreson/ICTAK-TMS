package com.TrainermanagementPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginandVerifyAllTrPage {
	WebDriver driver;
	@FindBy(xpath="/html/body/app-root/app-home/app-main-home/nav/div/div/ul/li[2]/a")
	private WebElement Login;
	@FindBy(id="floatingInput")
	private WebElement Emails;
	@FindBy(id="floatingPassword")
	private WebElement Passwords;
	@FindBy(css="button.w-100.btn.btn-lg.btn-primary")
	private WebElement Signin;
	@FindBy(xpath="/html/body/app-root/app-admindash/app-adminnav/nav/div/div/ul/li[2]/a")
	private WebElement Allocate;
	@FindBy(xpath="/html/body/app-root/app-search-trainer/div/div[2]/table/tbody/tr[4]/td[10]/a")
	private WebElement allocate;
	@FindBy(id="courseid")
	private WebElement courseid;
	@FindBy(id="batchid")
	private WebElement batchid; 
	@FindBy(id="scheduletime")
	private WebElement time;
	@FindBy(xpath="/html/body/app-root/app-allocation/form/div[4]/div[2]/input")
	private WebElement starttime;
	@FindBy(id="startdate")
	private WebElement startdate; 
	@FindBy(id="enddate")
	private WebElement enddate; 
	@FindBy(id="venue")
	private WebElement venue ; 
	@FindBy(xpath="/html/body/app-root/app-allocation/form/button")
	private WebElement Allocate2 ; 
	
	public LoginandVerifyAllTrPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//click on login
	public void clicklogin() {
		Login.click();
	}
	//Set Admin email
	public void setEmail(String Email) {
		Emails.sendKeys(Email);
		
	}
	//Set admin password
	public void setPassword(String Password) {
		Passwords.sendKeys(Password);
		
	}
	
	//click signin
	public void clicksignin() {
		Signin.click();
				
	}
	
	//Click allocate on admin login

	public void clickallocate() {
		Allocate.click();
				
	}
	
	
	//Click allocate on trainer profile

	public void clickAllocate() {
		allocate.click();
				
	}
	//click courseid
	public void clickCourseid(){ 
		courseid.click(); 
		} 
	
	//click batchid
	
	public void clickBatchid(){ 
		batchid.click(); 
		} 
	
	//Click time 

	public void clickTime(){ 
		starttime.click(); 
		} 

	//click start date
	public void clickStartDate(){ 
		startdate.click(); 
		} 
	//click end date
	public void clickEndDate(){ 
		enddate.click(); 
		} 
	//click venue
	
	public void clickVenue(){ 
		venue.click(); 
		} 

	//Allocate button disabled
	public boolean Allocate2ButtonAssertion()throws InterruptedException{
		Thread.sleep(4000);
		return Allocate2.isEnabled(); 
	//Click on allocate button 
	//public void clickAllocate2(){ 
		//allocate.click(); 
		//} 

	
	}

}
