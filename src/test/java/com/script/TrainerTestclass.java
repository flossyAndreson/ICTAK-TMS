package com.script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Trainerconstants.Trainermngmtconstants;
import com.TrainermanagementPages.LoginPage;
import com.TrainermanagementPages.MyAllocDetails;
import com.TrainermanagementPages.Trainerlogout;
import com.trainermngmt.utility.ExcelUtility1;

public class TrainerTestclass extends TestBase{
	
	LoginPage objLogin;
	MyAllocDetails objmyalloc;
	Trainerlogout objtrainlogout;

	@Test(priority=1)
	public void verifyTrainerValidLogin() throws IOException, Exception {
	//Create Login Page object
	objLogin = new LoginPage(driver);



	//login to application
	String Email = ExcelUtility1.getCellData(0,0);
	String Password = ExcelUtility1.getCellData(0,1);
	objLogin.clicklogin();
	Thread.sleep(4000);


	String expectedurl4 =Trainermngmtconstants.url4;
	String actualurl4 =driver.getCurrentUrl();
	Assert.assertEquals(expectedurl4,actualurl4);

	objLogin.setEmail(Email);
	objLogin.setPassword(Password);



	boolean actualResult =objLogin.SigninAssertion();
	Assert.assertEquals(actualResult, true);
    objLogin.clicksignin();
    Thread.sleep(4000);

	String expectedurl2 =Trainermngmtconstants.url2;
	String actualurl2=driver.getCurrentUrl();
	Assert.assertEquals(expectedurl2,actualurl2);
	Thread.sleep(4000);



	objmyalloc= new MyAllocDetails(driver);
	objmyalloc.clickmyalloc();
	driver.navigate().refresh();
	Thread.sleep(4000);



	String expectedurl3 =Trainermngmtconstants.url3;
	String actualurl3 =driver.getCurrentUrl();
	Assert.assertEquals(expectedurl3,actualurl3);


	objtrainlogout=new Trainerlogout(driver);
	objtrainlogout.clicktrainerlogout();
	Thread.sleep(4000);

	 String expectedurl22 =Trainermngmtconstants.url;
	 String actualurl22 =driver.getCurrentUrl();
	 Assert.assertEquals(expectedurl22,actualurl22);

	}	

}
