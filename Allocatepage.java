package icttrainermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Allocatepage {
	
	WebDriver driver;
	@FindBy(css="a[href='/admin/searchtrainer']")
	private WebElement Allocate;
@FindBy(css="a.btn btn-success")
private WebElement Allocatebutton;
	public Allocatepage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickallocate()
	{
		Allocate.click();
	}
	public void clickallocatebutton()
	{
		Allocatebutton.click();
	}
	

}
