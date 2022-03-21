package icttrainermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Approve {
	WebDriver driver;
	@FindBy(css="a.btn.btn-sucess")
	private WebElement Approves;
	public Approve(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickapprove()
	{
		Approves.click();
		}
	
	
	

}
