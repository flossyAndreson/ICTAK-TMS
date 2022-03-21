package com.TrainerManSys2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class AllocateTrainerPage {

	WebDriver driver;	
	
	
	@FindBy(id="courseid")
    private WebElement courseid;  
    @FindBy(xpath="/html/body/app-root/app-allocation/form/div[3]/div[2]/select/option[2]")
    private WebElement dsa;
    @FindBy(id="batchid")
    private WebElement batchid;  
    @FindBy(xpath="/html/body/app-root/app-allocation/form/div[4]/div[1]/select/option[2]")
    private WebElement dsa001;
    
    @FindBy(id="scheduletime")
	private WebElement time;
    @FindBy(id="scheduletime")
    private WebElement hour;
    @FindBy(id="scheduletime")
	private WebElement minute;
    @FindBy(id="scheduletime")
	private WebElement session;
    
    @FindBy(id="startdate")
	private WebElement startdate; 
    @FindBy(id="startdate")
    private WebElement smonth; 
    @FindBy(id="startdate")
    private WebElement sday; 
    @FindBy(id="startdate")
    private WebElement syear; 
	
    @FindBy(id="enddate")
	private WebElement enddate;
    @FindBy(id="enddate")
	private WebElement emonth;
    @FindBy(id="enddate")
	private WebElement eday;
    @FindBy(id="enddate")
	private WebElement eyear;
    
	@FindBy(id="venue")
	private WebElement venue ; 
	
	@FindBy(xpath="/html/body/app-root/app-allocation/form/button")
	private WebElement allocate2 ;

public AllocateTrainerPage(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}

//Scrollup
public void scrollUpPage() throws InterruptedException{
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("window.scrollBy(0,-500)", "");
  Thread.sleep(2000);
}

//Click on clickCourseid
public void clickCourseid() throws InterruptedException{
	Thread.sleep(2000);
	courseid.click();
}

//Click on dsa
public void clickDsa() throws InterruptedException{
	Thread.sleep(2000);
	dsa.click();
}
//click batchid
public void clickBatchid() throws InterruptedException{
		Thread.sleep(2000);
		batchid.click();
	}
	//Click on dsa001
public void clickDsa001() throws InterruptedException{
		Thread.sleep(2000);
		dsa001.click();
}
//click time
public void clickTime() throws InterruptedException{
	Thread.sleep(2000);
	time.click();
}


//set time
public void setHour(String Hour) {
			hour.sendKeys(Hour);
			
		}


public void setMinute(String Minute) {
			minute.sendKeys(Minute);
			
		}
		
public void setSession(String Session) {
			session.sendKeys(Session);
			
		}

//Scrolldown
public void scrollDownPage() throws InterruptedException{
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,300)", "");
    Thread.sleep(2000);
  }
	//click start date
public void clickStartDate() throws InterruptedException{
	Thread.sleep(2000);
	startdate.click();
}

//set start date
		
public void setSMonth(String SMonth) {
			smonth.sendKeys(SMonth);
			
		}
public void setSDay(String SDay) {
			sday.sendKeys(SDay);
			
		}
		
public void setSYear(String SYear) {
			syear.sendKeys(SYear);
			
		}
//click end date 
public void clickEndDate() throws InterruptedException{
	Thread.sleep(2000);
	enddate.click();
}


//set end date
public void setEMonth(String EMonth) {
	emonth.sendKeys(EMonth);
	
}
public void setEDay(String EDay) {
	eday.sendKeys(EDay);
	
}

public void setEYear(String EYear) {
	eyear.sendKeys(EYear);
	
}

//Set venue in venue textbox 
	public void setVenue(String strVenue){ 
		venue.sendKeys(strVenue); 
		}

	public boolean Allocate2ButtonAssertion()throws InterruptedException{
		Thread.sleep(4000);
		return allocate2.isEnabled(); }

	//Click on allocate button 
	public void clickAllocate2(){ 
		allocate2.click(); 
		} 



}