package icttrainermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reject {
	WebDriver driver;
	@FindBy(css="a.btn.btn-danger")
	private WebElement Rejects;
	public Reject(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickreject() 
	{
		Rejects.click();
				
	}

}
