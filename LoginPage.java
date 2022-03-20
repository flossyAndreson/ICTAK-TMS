package com.TMS.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[2]/a")
	private WebElement Login;
	@FindBy(id="floatingInput")
	private WebElement Emails;
	@FindBy(id="floatingPassword")
	private WebElement Passwords;
	@FindBy(css="button.w-100.btn.btn-lg.btn-primary")
	private WebElement Signin;
	
	
	public LoginPage(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}
	
	    public void clicklogin() {
		Login.click();
		}
	    
		public void setPassword(String Password) {
		Passwords.clear();
		Passwords.sendKeys(Password);
		}
		
		public String getPassword() {
		String text=Passwords.getAttribute("value");
		return text;
		}
		
		
		public void setEmail(String Email) {
		Emails.clear();	
		Emails.sendKeys(Email);
		}
		public String getEmail() {
		String text=Emails.getAttribute("value");
		return text;
		}
		
		public void clicksignin() {
		Signin.click();
		}
		
		//Scrollup
		  public void scrollUpPage() throws InterruptedException{
		  	Thread.sleep(3000);
		  	JavascriptExecutor js = (JavascriptExecutor) driver;
		      js.executeScript("window.scrollBy(0,-600)", "");
		      Thread.sleep(3000);
		  }

		
		
		
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

