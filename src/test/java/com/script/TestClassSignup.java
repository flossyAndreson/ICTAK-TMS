package com.script;
import com.TrainermanagementPages.EditProfilePage;
import com.TrainermanagementPages.LoginPage;
import com.TrainermanagementPages.LoginPageF;
import com.TrainermanagementPages.MyAllocDetails;
import com.TrainermanagementPages.MyProfilePage;
import com.TrainermanagementPages.SignUpPage;
import com.TrainermanagementPages.Trainerlogout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;
import com.Trainerconstants.AutomationConstantsM;
import com.Trainerconstants.Trainermngmtconstants;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import  com.script.TestBase;
import com.trainermngmt.utility.ExcelUtility1;
import com.trainermngmt.utility.ExcelUtility2;



public class TestClassSignup extends TestBase{
	       
	SignUpPage objSignUp;
	LoginPageF objLoginF;
	MyProfilePage  objMyProfile;  
	EditProfilePage  objEditProfile; 
	LoginPage objLogin;
	MyAllocDetails objmyalloc;
	Trainerlogout objtrainlogout;
       
    @Test(priority=1)
    public void verifyEnrollPage() throws IOException, InterruptedException {
    //Create signup Page object
    objSignUp = new SignUpPage(driver);
    //login to application
    objSignUp.clickEnroll();
    String expectedURL =AutomationConstantsM.SIGNUPURL;
    String actualURL =driver.getCurrentUrl();
    Assert.assertEquals(expectedURL,actualURL);
    }
    
    

       
    @Test(priority=2)
    public void verifyInvalidSignUp() throws IOException, InterruptedException {
    //Create signup Page object
    objSignUp = new SignUpPage(driver);
    // entry to signup page 
    String name = com.trainermngmt.utility.ExcelUtility2.getCellData(0,0);
    String email = com.trainermngmt.utility.ExcelUtility2.getCellData(0,1); 
    String mobile = com.trainermngmt.utility.ExcelUtility2.getCellData(0,2);
    String address = com.trainermngmt.utility.ExcelUtility2.getCellData(0,3);
    String qualification = com.trainermngmt.utility.ExcelUtility2.getCellData(0,4);
    String skill = com.trainermngmt.utility.ExcelUtility2.getCellData(0,5);
    String currentCompany = com.trainermngmt.utility.ExcelUtility2.getCellData(0,6);
    String currentDesignation = com.trainermngmt.utility.ExcelUtility2.getCellData(0,7);
    String password = com.trainermngmt.utility.ExcelUtility2.getCellData(0,8);
    String retypePassword = com.trainermngmt.utility.ExcelUtility2.getCellData(0,9);
   

    objSignUp.setName(name);
    objSignUp.setEmail(email);
    objSignUp.setMobile(mobile);
    objSignUp.setAddress(address);
    objSignUp.setQualification(qualification);
    objSignUp.setSkill(skill);
    objSignUp.setCurrentCompany(currentCompany);
    objSignUp.setCurrentDesignation(currentDesignation);
    objSignUp.scrollDownPage();
    objSignUp.clickCourse();
    objSignUp.clickCourse1();
    objSignUp.clickCourse2();
    objSignUp.setPassword(password);
    objSignUp.setRetypePassword(retypePassword);
    objSignUp.clickPage();
  
   
    //Assertion for name
    String expectedErrorMessage1 =AutomationConstantsM.NAME_ERROR_MESSAGE;
    String actualErrorMessage1 =objSignUp.getErrorMessageName();
    Assert.assertEquals(expectedErrorMessage1,actualErrorMessage1);
    
    //Assertion for email
    String expectedErrorMessage2 =AutomationConstantsM.EMAIL_ERROR_MESSAGE;
    String actualErrorMessage2 =objSignUp.getErrorMessageEmail();
    Assert.assertEquals(expectedErrorMessage2,actualErrorMessage2);
    
    //Assertion for mobile
    String expectedErrorMessage3 =AutomationConstantsM.MOBILE_ERROR_MESSAGE;
    String actualErrorMessage3 =objSignUp.getErrorMessageMobile();
    Assert.assertEquals(expectedErrorMessage3,actualErrorMessage3);
    
    //Assertion for address
    String expectedErrorMessage4 =AutomationConstantsM.ADDRESS_ERROR_MESSAGE;
    String actualErrorMessage4 =objSignUp.getErrorMessageAddress();
    Assert.assertEquals(expectedErrorMessage4,actualErrorMessage4);
    
    //Assertion for qualification
    String expectedErrorMessage5 =AutomationConstantsM.QUALIFICATION_ERROR_MESSAGE;
    String actualErrorMessage5 =objSignUp.getErrorMessageQualification();
    Assert.assertEquals(expectedErrorMessage5,actualErrorMessage5);
    
    //Assertion for skill
    String expectedErrorMessage6 =AutomationConstantsM.SKILL_ERROR_MESSAGE;
    String actualErrorMessage6 =objSignUp.getErrorMessageSkill();
    Assert.assertEquals(expectedErrorMessage6,actualErrorMessage6);
    
    //Assertion for CurrentCompany
    String expectedErrorMessage7 =AutomationConstantsM.CURRENTCOMPANY_ERROR_MESSAGE;
    String actualErrorMessage7 =objSignUp.getErrorMessageCurrentCompany();
    Assert.assertEquals(expectedErrorMessage7,actualErrorMessage7);
    
    //Assertion for CurrentDesignation
    String expectedErrorMessage8 =AutomationConstantsM.CURRENTDESIGNATION_ERROR_MESSAGE;
    String actualErrorMessage8 =objSignUp.getErrorMessageCurrentDesignation();
    Assert.assertEquals(expectedErrorMessage8,actualErrorMessage8);
    
    //Assertion for password
    String expectedErrorMessage10 =AutomationConstantsM.PASSWORD_ERROR_MESSAGE;
    String actualErrorMessage10 =objSignUp.getErrorMessagePassword();
    Assert.assertEquals(expectedErrorMessage10,actualErrorMessage10);
    
    //Assertion for Retype password
    String expectedErrorMessage11 =AutomationConstantsM.RETYPEPASSWORD_ERROR_MESSAGE;
    String actualErrorMessage11 =objSignUp.getErrorMessageRetypePassword();
    Assert.assertEquals(expectedErrorMessage11,actualErrorMessage11);
    
    //Assertion for button disable 
    boolean actualResult =objSignUp.SignupButtonAssertion();
    Assert.assertEquals(false , actualResult);
 
    }
    
   
   
    @Test(priority=3)
    public void verifyValidSignUp() throws IOException, InterruptedException {
    //Create signup Page object
    objSignUp = new SignUpPage(driver);
    // entry to signup page 
    String name = ExcelUtility2.getCellData(2,0);
    String email = ExcelUtility2.getCellData(2,1); 
    String mobile = ExcelUtility2.getCellData(2,2);
    String address = ExcelUtility2.getCellData(2,3);
    String qualification = ExcelUtility2.getCellData(2,4);
    String skill = ExcelUtility2.getCellData(2,5);
    String currentCompany = ExcelUtility2.getCellData(2,6);
    String currentDesignation = ExcelUtility2.getCellData(2,7);
    String password = ExcelUtility2.getCellData(2,8);
    String retypePassword = ExcelUtility2.getCellData(2,9);
    String photo = ExcelUtility2.getCellData(2,10);
   
    objSignUp.scrollUpPage();
    objSignUp.setName(name);
    objSignUp.setEmail(email);
    objSignUp.setMobile(mobile);
    objSignUp.setAddress(address);
    objSignUp.setQualification(qualification);
    objSignUp.setSkill(skill);
    objSignUp.setCurrentCompany(currentCompany);
    objSignUp.setCurrentDesignation(currentDesignation);
    objSignUp.scrollDownPage();
    objSignUp.clickCourse();
    objSignUp.clickCourse1();
    objSignUp.clickCourse2();
    objSignUp.setPhoto(photo);
    objSignUp.setPassword(password);
    objSignUp.setRetypePassword(retypePassword);
    
    
        //Assertion to check whether the entered data is same as from the sheet 
    Assert.assertEquals(name,objSignUp.getName());
    Assert.assertEquals(email,objSignUp.getEmail());
    Assert.assertEquals(mobile,objSignUp.getMobile());
    Assert.assertEquals(address,objSignUp.getAddress());
    Assert.assertEquals(qualification,objSignUp.getQualification());
    Assert.assertEquals(skill,objSignUp.getSkill());
    Assert.assertEquals(currentCompany,objSignUp.getCurrentCompany());
    Assert.assertEquals(currentDesignation,objSignUp.getCurrentDesignation());
    Assert.assertEquals(password,objSignUp.getPassword());
    Assert.assertEquals(retypePassword,objSignUp.getRetypePassword());

    
    

    //Assertion for button enable 
    boolean actualResult =objSignUp.SignupButtonAssertion();
    Assert.assertEquals(true , actualResult);
    objSignUp.clickSignUp(); 
    
    String expectedAlert =AutomationConstantsM.ALERT_MESSAGE;
    String actualAlert = driver.switchTo().alert().getText();
    Assert.assertEquals(expectedAlert,actualAlert);
   
    driver.switchTo().alert().accept();
   
    String expectedURL =AutomationConstantsM.LOGINURL;
    String actualURL =driver.getCurrentUrl();
    Assert.assertEquals(expectedURL,actualURL);
 
    }
          
    
    
   

    @Test(priority=4)
        public void verifyValidLogin() throws IOException, InterruptedException {
        //Create Login Page object
        objLoginF = new LoginPageF(driver);
       
        //login to application
        String Email = ExcelUtility2.getCellData(3,0);
        String Password = ExcelUtility2.getCellData(3,1);
        objLoginF.scrollUpPage();
        objLoginF.clicklogin();
        objLoginF.setEmail(Email);
        objLoginF.setPassword(Password);
        
        //Assertion - given password&email from excel and text from textbox is correct
        Assert.assertEquals(Email,objLoginF.getEmail());
        Assert.assertEquals(Password,objLoginF.getPassword());
        
        objLoginF.clicksignin(); 
        String expectedURL =AutomationConstantsM.LOGINURL;
        String actualURL =driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
        
        
        
        }
    
    
    @Test(priority=5)
    public void verifyMyProfile() throws IOException, InterruptedException {
    //Create Myprofilepage object
    objMyProfile = new MyProfilePage(driver);
    objMyProfile.getTable();
    String mobile = ExcelUtility2.getCellData(4,2);
    String email = ExcelUtility2.getCellData(4,1); 
    String address = ExcelUtility2.getCellData(4,3);
    String qualification = ExcelUtility2.getCellData(4,4);
    String skill = ExcelUtility2.getCellData(4,5);
    String currentCompany = ExcelUtility2.getCellData(4,6);
    String currentDesignation = ExcelUtility2.getCellData(4,7);
    
    List<String> listnew1 = new ArrayList<String>();
    listnew1=objMyProfile.getTable();
    Assert.assertEquals(mobile,listnew1.get(0));
    Assert.assertEquals(email,listnew1.get(1));
    Assert.assertEquals(address,listnew1.get(2));
    Assert.assertEquals(qualification,listnew1.get(3));
    Assert.assertEquals(currentCompany,listnew1.get(4));
    Assert.assertEquals(currentDesignation,listnew1.get(5));
    Assert.assertEquals(skill,listnew1.get(6));
 
    }

    
    
    @Test(priority=6)
    public void verifyEditProfile() throws IOException, InterruptedException {
    //Create Myprofilepage object
    objEditProfile = new EditProfilePage(driver);
  //Assertion for editprofile button enable 
    boolean actualResult =objEditProfile.EditProfileButtonAssertion();
    Assert.assertEquals(true , actualResult);
    objEditProfile.clickEditProfile();
    String expectedURL =AutomationConstantsM.EDITDETAILURL;
    String actualURL =driver.getCurrentUrl();
    Assert.assertEquals(expectedURL,actualURL);
    }
    
    
    
    @Test(priority=7)
    public void verifyInvalidEditProfile() throws IOException, InterruptedException {
    //Create Myprofilepage object
    objEditProfile = new EditProfilePage(driver);
    String name = ExcelUtility2.getCellData(0,0);
    String email = ExcelUtility2.getCellData(0,1); 
    String mobile = ExcelUtility2.getCellData(0,2);
    String address = ExcelUtility2.getCellData(0,3);
    String qualification = ExcelUtility2.getCellData(0,4);
    String skill = ExcelUtility2.getCellData(0,5);
    String currentCompany = ExcelUtility2.getCellData(0,6);
    String currentDesignation = ExcelUtility2.getCellData(0,7);
  
    objEditProfile.setName(name);
    objEditProfile.setEmail(email);
    objEditProfile.setMobile(mobile);
    objEditProfile.setAddress(address);
    objEditProfile.setQualification(qualification);
    objEditProfile.setSkill(skill);
    objEditProfile.setCurrentCompany(currentCompany);
    objEditProfile.setCurrentDesignation(currentDesignation);
    objEditProfile.scrollDownPage();
    objEditProfile.scrollUpPage();
    objEditProfile.clickPage();
    objEditProfile.scrollDownPage();
  
   
    //Assertion for name
    String expectedErrorMessage1 =AutomationConstantsM.NAME_ERROR_MESSAGE;
    String actualErrorMessage1 =objEditProfile.getErrorMessageName();
    Assert.assertEquals(expectedErrorMessage1,actualErrorMessage1);
    
    //Assertion for email
    String expectedErrorMessage2 =AutomationConstantsM.EMAIL_ERROR_MESSAGE;
    String actualErrorMessage2 =objEditProfile.getErrorMessageEmail();
    Assert.assertEquals(expectedErrorMessage2,actualErrorMessage2);
    
    //Assertion for mobile
    String expectedErrorMessage3 =AutomationConstantsM.MOBILE_ERROR_MESSAGE;
    String actualErrorMessage3 =objEditProfile.getErrorMessageMobile();
    Assert.assertEquals(expectedErrorMessage3,actualErrorMessage3);
    
    //Assertion for address
    String expectedErrorMessage4 =AutomationConstantsM.ADDRESS_ERROR_MESSAGE;
    String actualErrorMessage4 =objEditProfile.getErrorMessageAddress();
    Assert.assertEquals(expectedErrorMessage4,actualErrorMessage4);
    
    //Assertion for qualification
    String expectedErrorMessage5 =AutomationConstantsM.QUALIFICATION_ERROR_MESSAGE;
    String actualErrorMessage5 =objEditProfile.getErrorMessageQualification();
    Assert.assertEquals(expectedErrorMessage5,actualErrorMessage5);
    
    //Assertion for skill
    String expectedErrorMessage6 =AutomationConstantsM.SKILL_ERROR_MESSAGE;
    String actualErrorMessage6 =objEditProfile.getErrorMessageSkill();
    Assert.assertEquals(expectedErrorMessage6,actualErrorMessage6);
    
    //Assertion for CurrentCompany
    String expectedErrorMessage7 =AutomationConstantsM.CURRENTCOMPANY_ERROR_MESSAGE;
    String actualErrorMessage7 =objEditProfile.getErrorMessageCurrentCompany();
    Assert.assertEquals(expectedErrorMessage7,actualErrorMessage7);
    
    //Assertion for CurrentDesignation
    String expectedErrorMessage8 =AutomationConstantsM.CURRENTDESIGNATION_ERROR_MESSAGE;
    String actualErrorMessage8 =objEditProfile.getErrorMessageCurrentDesignation();
    Assert.assertEquals(expectedErrorMessage8,actualErrorMessage8);
   
    //Assertion for button disable 
    boolean actualResult =objEditProfile.editButtonAssertion();
    Assert.assertEquals(false , actualResult);
    }
    
    

    @Test(priority=8)
    public void verifyValidEditProfile() throws IOException, InterruptedException {
    //Create signup Page object
    	objEditProfile = new EditProfilePage(driver);
    // entry to signup page 
    String name = ExcelUtility2.getCellData(4,0);
    String email = ExcelUtility2.getCellData(4,1); 
    String mobile = ExcelUtility2.getCellData(4,2);
    String address = ExcelUtility2.getCellData(4,3);
    String qualification = ExcelUtility2.getCellData(4,4);
    String skill = ExcelUtility2.getCellData(4,5);
    String currentCompany = ExcelUtility2.getCellData(4,6);
    String currentDesignation = ExcelUtility2.getCellData(4,7);
    String photo = ExcelUtility2.getCellData(2,10);
   
    objEditProfile.scrollUpPage();
    objEditProfile.setName(name);
    objEditProfile.setEmail(email);
    objEditProfile.setMobile(mobile);
    objEditProfile.setAddress(address);
    objEditProfile.setQualification(qualification);
    objEditProfile.setSkill(skill);
    objEditProfile.setCurrentCompany(currentCompany);
    objEditProfile.setCurrentDesignation(currentDesignation);
    objEditProfile.scrollDownPage();
    objEditProfile.setPhoto(photo);
   

    //Assertion for button enable 
    boolean actualResult =objEditProfile.editButtonAssertion();
    Assert.assertEquals(true , actualResult);
    objEditProfile.clickEdit(); 
    
    //Assertion for url
    String expectedURL =AutomationConstantsM.PROFILEURL;
    String actualURL =driver.getCurrentUrl();
    Assert.assertEquals(expectedURL,actualURL);
    
    
  

	}	



    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      

