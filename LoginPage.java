package icttrainermanagement;

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
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogin() {
		Login.click();
	}
	public void setPassword(String Password) {
		Passwords.sendKeys(Password);
		
	}
	public void setEmail(String Email) {
		Emails.sendKeys(Email);
		
	}
	public void clicksignin() {
		Signin.click();
				
	}
}
		

