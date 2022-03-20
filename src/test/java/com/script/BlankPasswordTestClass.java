package com.script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TrainermanagementPages.LoginPage;
import com.trainermngmt.utility.ExcelUtility1;

public class BlankPasswordTestClass extends TestBase {
LoginPage objLogin;




@Test(priority=1)
public void verifyInValidLogin4() throws IOException, InterruptedException {
//Create Login Page object
objLogin = new LoginPage(driver);

//login to application
Thread.sleep(4000);
String ValidEmail = ExcelUtility1.getCellData(5,0);
String NoPassword = ExcelUtility1.getCellData(5,1);
objLogin.clicklogin();
objLogin.setEmail(ValidEmail);
objLogin.setPassword(NoPassword);

boolean actualResult =objLogin.SigninAssertion();
Assert.assertEquals(actualResult, false);

}



@Test(priority=2)
public void verifyInValidLogin5() throws IOException, InterruptedException {
//Create Login Page object
objLogin = new LoginPage(driver);

//login to application

String InValidEmail = ExcelUtility1.getCellData(6,0);
String NoPassword = ExcelUtility1.getCellData(6,1);
objLogin.clicklogin();
objLogin.setEmail(InValidEmail);
objLogin.setPassword(NoPassword);
boolean actualResult =objLogin.SigninAssertion();
Assert.assertEquals(actualResult, false);



}

}
