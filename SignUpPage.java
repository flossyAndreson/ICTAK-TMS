package com.TMS.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	WebDriver driver;
	   
    @FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[3]/a")
    private WebElement enroll;
    
    @FindBy(id="name")
    private WebElement name; 
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[1]/div[1]/small")
    private WebElement errorMessageName; 
    @FindBy(id="email")
    private WebElement email;
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[1]/div[2]/small")
    private WebElement errorMessageEmail; 
    @FindBy(id="phone")
    private WebElement mobile;  
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[2]/div[1]/small")
    private WebElement errorMessageMobile; 
    @FindBy(id="address")
    private WebElement address;
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[2]/div[2]/small")
    private WebElement errorMessageAddress; 
    @FindBy(id="h_qualification")
    private WebElement qualification; 
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[3]/div[1]/small")
    private WebElement errorMessageQualification; 
    @FindBy(id="skillSet")
    private WebElement skill;
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[3]/div[2]/small")
    private WebElement errorMessageSkill; 
    @FindBy(id="company_name")
    private WebElement currentCompany; 
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[4]/div[1]/small")
    private WebElement errorMessageCurrentCompany; 
    @FindBy(id="designation")
    private WebElement currentDesignation;
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[4]/div[2]/small")
    private WebElement errorMessageCurrentDesignation; 
    @FindBy(id="img")
    private WebElement photo;
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[5]/div[1]/small")
    private WebElement errorMessagePhoto; 
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[5]/div[2]/ng-multiselect-dropdown/div/div[1]/span")
    private WebElement courses;  
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[5]/div[2]/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]/div")
    private WebElement course1;
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[5]/div[2]/ng-multiselect-dropdown/div/div[2]/ul[2]/li[3]/div")
    private WebElement course2;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[6]/div[1]/small")
    private WebElement errorMessagePassword; 
    @FindBy(id="re_password")
    private WebElement retypePassword;
    @FindBy(xpath="//*[@id=\"error\"]")
    private WebElement errorMessageRetypePassword;
    
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/button")
    private WebElement button;
    @FindBy(xpath="/html/body/app-root/app-sign-up/app-main-home/nav/div/a")
    private WebElement pageClick;


public SignUpPage(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}

//Click on signup/enroll button
public void clickEnroll() throws InterruptedException{
	Thread.sleep(3000);
	enroll.click();
}


//Set name 
public void setName(String Name){
	name.clear();
	name.sendKeys(Name);    
}
public String getErrorMessageName(){
	return errorMessageName.getText();   
}
public String getName() {
	String text=name.getAttribute("value");
	return text;
	}

//Set email 
public void setEmail(String Email){
	email.clear();
	email.sendKeys(Email);
}
public String getErrorMessageEmail(){
	return errorMessageEmail.getText();   
}
public String getEmail() {
	String text=email.getAttribute("value");
	return text;
	}

//Set mobile 
public void setMobile(String Mobile){
	mobile.clear();
	mobile.sendKeys(Mobile);    
}
public String getErrorMessageMobile(){
	return errorMessageMobile.getText();   
}
public String getMobile() {
	String text=mobile.getAttribute("value");
	return text;
	}

//Set address 
public void setAddress(String Address){
	address.clear();
	address.sendKeys(Address);
}
public String getErrorMessageAddress(){
	return errorMessageAddress.getText();   
}
public String getAddress() {
	String text=address.getAttribute("value");
	return text;
	}

//Set qualification 
public void setQualification(String Qualification){
	qualification.clear();
	qualification.sendKeys(Qualification);    
}
public String getErrorMessageQualification(){
	return errorMessageQualification.getText();   
}
public String getQualification() {
	String text=qualification.getAttribute("value");
	return text;
	}

//Set skill 
public void setSkill(String Skill){
	skill.clear();
	skill.sendKeys(Skill);
}
public String getErrorMessageSkill(){
	return errorMessageSkill.getText();   
}
public String getSkill() {
	String text=skill.getAttribute("value");
	return text;
	}

//Set currentCompany 
public void setCurrentCompany(String CurrentCompany){
	currentCompany.clear();
	currentCompany.sendKeys(CurrentCompany);    
}
public String getErrorMessageCurrentCompany(){
	return errorMessageCurrentCompany.getText();   
}
public String getCurrentCompany() {
	String text=currentCompany.getAttribute("value");
	return text;
	}

//Set currentDesignation 
public void setCurrentDesignation(String CurrentDesignation){
	currentDesignation.clear();
	currentDesignation.sendKeys(CurrentDesignation);
}
public String getErrorMessageCurrentDesignation(){
	return errorMessageCurrentDesignation.getText();   
}
public String getCurrentDesignation() {
	String text=currentDesignation.getAttribute("value");
	return text;
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
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,-500)", "");
    Thread.sleep(2000);
}


////Set photo 
public void setPhoto(String Photo){
	photo.sendKeys(Photo); 
}


//Click on clickCourse
public void clickCourse() throws InterruptedException{
	Thread.sleep(3000);
	courses.click();
}
//Click on Course1
public void clickCourse1() throws InterruptedException{
	Thread.sleep(3000);
	course1.click();
}	
//Click on Course2
public void clickCourse2() throws InterruptedException{
	Thread.sleep(3000);
	course2.click();
}	
//Set password
public void setPassword(String Password){
	password.clear();
	password.sendKeys(Password);    
}
public String getErrorMessagePassword(){
	return errorMessagePassword.getText();   
}
public String getPassword() {
	String text=password.getAttribute("value");
	return text;
	}

//Set retypePassword 
public void setRetypePassword(String RetypePassword){
	retypePassword.clear();
	retypePassword.sendKeys(RetypePassword);    
}
public String getErrorMessageRetypePassword(){
	return errorMessageRetypePassword.getText();   
}
public String getRetypePassword() {
	String text=retypePassword.getAttribute("value");
	return text;
	}


//signup button disabled
public boolean SignupButtonAssertion()throws InterruptedException{
	Thread.sleep(4000);
	return button.isEnabled(); 
	
}

//signup button click
public void clickSignUp()throws InterruptedException{
	button.click();
	Thread.sleep(3000);
}

//signup pageclick
public void clickPage()throws InterruptedException{
	pageClick.click();
	Thread.sleep(3000);
}






	
	
	
	
	
	
	
	
	
	
}
