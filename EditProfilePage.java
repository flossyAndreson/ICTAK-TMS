package com.TMS.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePage {

	WebDriver driver;
	
	
	   
    @FindBy(xpath="/html/body/app-root/app-trainerprofile/div/div/div/div[1]/div/div/button")
    private WebElement editProfileButton;
	
    @FindBy(id="name")
    private WebElement name; 
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/div[1]/div[1]/small")
    private WebElement errorMessageName; 
    @FindBy(id="email")
    private WebElement email;
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/div[1]/div[2]/small")
    private WebElement errorMessageEmail; 
    @FindBy(id="phone")
    private WebElement mobile;  
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/div[2]/div[1]/small")
    private WebElement errorMessageMobile; 
    @FindBy(id="address")
    private WebElement address;
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/div[2]/div[2]/small")
    private WebElement errorMessageAddress; 
    @FindBy(id="h_qualification")
    private WebElement qualification; 
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/div[3]/div[1]/small")
    private WebElement errorMessageQualification; 
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/div[3]/div[2]/input")
    private WebElement skill;
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/div[3]/div[2]/small")
    private WebElement errorMessageSkill; 
    @FindBy(id="company_name")
    private WebElement currentCompany; 
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/div[4]/div[1]/small")
    private WebElement errorMessageCurrentCompany; 
    @FindBy(id="designation")
    private WebElement currentDesignation;
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/div[4]/div[2]/small")
    private WebElement errorMessageCurrentDesignation; 
    @FindBy(id="img")
    private WebElement photo;  
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/button")
    private WebElement editbutton;
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/app-trainer-dashboard/nav/div/a")
    private WebElement pageClick;

	
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   public EditProfilePage(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}

   // for edit profile assertion
    public boolean EditProfileButtonAssertion()throws InterruptedException{
   	Thread.sleep(2000);
   	return editProfileButton.isEnabled(); 
   }
   
   
 //editprofile button click
    public void clickEditProfile()throws InterruptedException{
    	Thread.sleep(3000);
    editProfileButton.click();
   	Thread.sleep(3000);
   }
	

  //Set name 
  public void setName(String Name){
  	name.clear();
  	name.sendKeys(Name);    
  }
  public String getErrorMessageName(){
  	return errorMessageName.getText();   
  }

  //Set email 
  public void setEmail(String Email){
  	email.clear();
  	email.sendKeys(Email);
  }
  public String getErrorMessageEmail(){
  	return errorMessageEmail.getText();   
  }

  //Set name 
  public void setMobile(String Mobile){
  	mobile.clear();
  	mobile.sendKeys(Mobile);    
  }
  public String getErrorMessageMobile(){
  	return errorMessageMobile.getText();   
  }

  //Set address 
  public void setAddress(String Address){
  	address.clear();
  	address.sendKeys(Address);
  }
  public String getErrorMessageAddress(){
  	return errorMessageAddress.getText();   
  }

  //Set qualification 
  public void setQualification(String Qualification){
  	qualification.clear();
  	qualification.sendKeys(Qualification);    
  }
  public String getErrorMessageQualification(){
  	return errorMessageQualification.getText();   
  }

  //Set skill 
  public void setSkill(String Skill){
  	skill.clear();
  	skill.sendKeys(Skill);
  }
  public String getErrorMessageSkill(){
  	return errorMessageSkill.getText();   
  }

  //Set currentCompany 
  public void setCurrentCompany(String CurrentCompany){
  	currentCompany.clear();
  	currentCompany.sendKeys(CurrentCompany);    
  }
  public String getErrorMessageCurrentCompany(){
  	return errorMessageCurrentCompany.getText();   
  }

  //Set currentDesignation 
  public void setCurrentDesignation(String CurrentDesignation){
  	currentDesignation.clear();
  	currentDesignation.sendKeys(CurrentDesignation);
  }
  public String getErrorMessageCurrentDesignation(){
  	return errorMessageCurrentDesignation.getText();   
  }

  //Scrolldown
  public void scrollDownPage() throws InterruptedException{
  	Thread.sleep(2000);
  	JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,500)", "");
      Thread.sleep(2000);
    }

  //Scrollup
  public void scrollUpPage() throws InterruptedException{
  	Thread.sleep(3000);
  	JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,-600)", "");
      Thread.sleep(3000);
  }


  ////Set photo 
  public void setPhoto(String Photo){
  	photo.sendKeys(Photo); 
  }


  //edit button disabled
  public boolean editButtonAssertion()throws InterruptedException{
  	Thread.sleep(4000);
  	return editbutton.isEnabled(); 
  	
  }

  //edit button click
  public void clickEdit()throws InterruptedException{
	editbutton.click();
  	Thread.sleep(3000);
  }

  //edit pageclick
  public void clickPage()throws InterruptedException{
	  Thread.sleep(3000);
  	pageClick.click();
  	Thread.sleep(3000);
  }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
