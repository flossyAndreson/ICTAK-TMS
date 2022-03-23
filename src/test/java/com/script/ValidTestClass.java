package com.script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Trainerconstants.AutomationConstantsF;
import com.Trainerconstants.Trainermngmtconstants;
import com.TrainermanagementPages.Adminlogout;
import com.TrainermanagementPages.Allocate1;
import com.TrainermanagementPages.AllocateTrainerPage;
import com.TrainermanagementPages.Approve1;
import com.TrainermanagementPages.LoginPage;
import com.TrainermanagementPages.LoginandVerifyAllTrPage;
import com.TrainermanagementPages.MyAllocDetails;
import com.TrainermanagementPages.Reject1;
import com.TrainermanagementPages.Trainerlogout;
import com.TrainermanagementPages.ViewAlloc;
import com.trainermngmt.utility.ExcelUtility1;

public class ValidTestClass extends TestBase{
	
	LoginPage objLogin;
	
	MyAllocDetails objmyalloc;
	Trainerlogout objtrainlogout;
	ViewAlloc objview;
	Adminlogout objadlogout;
	Approve1 objapprove;
	Reject1 objrej;
	Allocate1 objalloc;	
	LoginandVerifyAllTrPage objLoginM;
	AllocateTrainerPage objAllocateTr;


			
			@Test(priority=1)
		    public void verifyAdminValidLogin() throws IOException, InterruptedException {
		    //Create Login Page object
		    objLogin = new LoginPage(driver);
		    
		    
		    //login to application
		    String ValidEmail = ExcelUtility1.getCellData(1,0);
		    String ValidPassword = ExcelUtility1.getCellData(1,1);
		    objLogin.clicklogin();
		    
		    String expectedurl4 =Trainermngmtconstants.url4;
		    String actualurl4 =driver.getCurrentUrl();
		    Assert.assertEquals(expectedurl4,actualurl4);
		    
		    objLogin.setEmail(ValidEmail);
		    objLogin.setPassword(ValidPassword);
		    
		    boolean actualResult =objLogin.SigninAssertion();
		    Assert.assertEquals(actualResult, true);
		    
		    objLogin.clicksignin();
		    Thread.sleep(4000);
		    
		   String expectedurl5 =Trainermngmtconstants.url5;
		   String actualurl5 =driver.getCurrentUrl();
		   Assert.assertEquals(expectedurl5,actualurl5);
		   Thread.sleep(4000);
		   
			}
		    
		   
		   
		   
		   ////
		   
		   
		   

			@Test(priority=2)
		    public void verifyHomepage() throws IOException, InterruptedException {
		   
		   objapprove=new Approve1(driver);
		    boolean actualResult1 =objapprove.ApproveAssertion();
		    Assert.assertEquals(actualResult1, true);
		    objapprove.clickapprove();
		    Thread.sleep(4000);
		    
		    objrej=new Reject1(driver);
		    boolean actualResult2 =objrej.RejectAssertion();
		    Assert.assertEquals(actualResult2, true);
		    objrej.clickreject();
		    Thread.sleep(4000);
		    
		    
		    
		    objalloc=new Allocate1(driver);
		    objalloc.clickallocate();
		    Thread.sleep(4000);
		    String expectedurl6 =Trainermngmtconstants.url6;
		    String actualurl6 =driver.getCurrentUrl();
		    Assert.assertEquals(expectedurl6,actualurl6);
		    
		    
		   
		    boolean actualResult3 =objalloc.AllocAssertion();
		    Assert.assertEquals(actualResult3, true);
		    
		    
		    
//////
		    
			}
		    
		    @Test(priority=3)
		    public void verifyAllocateTrainer() throws InterruptedException, IOException{
		  //Create Allocate Trainer Page object
		    	
		    	
		    	
		    	objalloc=new Allocate1(driver);
		    	objalloc.clickAllocate();
			    Thread.sleep(4000);
			    
		    	objLoginM=new LoginandVerifyAllTrPage(driver);
			    objLoginM.clickCourseid();
			    
			    objLoginM.clickBatchid();
			    
			    
			    objLoginM.clickTime();
			    
			    objLoginM.clickStartDate();
			    objLoginM.clickEndDate();
			    objLoginM.clickVenue();
			    Thread.sleep(4000);
			    
			    
		    objAllocateTr = new AllocateTrainerPage(driver);
		    
		    objAllocateTr.scrollUpPage();
		    
		    objAllocateTr.clickCourseid();
		    objAllocateTr.clickDsa();
		    objAllocateTr.clickBatchid();
		    objAllocateTr.clickDsa001();
		    objAllocateTr.clickTime();
		    
		    
		    String hour = ExcelUtility1.getCellData(0,2);
		    String minute = ExcelUtility1.getCellData(0,3);
		 
		    
		    objAllocateTr.setHour(hour);
		    objAllocateTr.setMinute(minute);
	
		    
		    objAllocateTr.scrollDownPage();
		    objAllocateTr.clickStartDate();
		    
		    String smonth = ExcelUtility1.getCellData(10,0);
		    String sday = ExcelUtility1.getCellData(10,1);
		    String syear = ExcelUtility1.getCellData(10,2);
		    
		    objAllocateTr.setSMonth(smonth);
		    objAllocateTr.setSDay(sday);
		    objAllocateTr.setSYear(syear);
		    
		    objAllocateTr.clickEndDate();
		    
		    String emonth = ExcelUtility1.getCellData(11,0);
		    String eday = ExcelUtility1.getCellData(11,1);
		    String eyear = ExcelUtility1.getCellData(11,2);
		    
		    objAllocateTr.setEMonth(emonth);
		    objAllocateTr.setEDay(eday);
		    objAllocateTr.setEYear(eyear);
		    Thread.sleep(4000);
		    
		    
		    
		    String venue = ExcelUtility1.getCellData(12,0);
		    objAllocateTr.setVenue(venue);
		    Thread.sleep(4000);
		    
		    
		  //Assertion for Allocate button enable 
		    boolean actualResultMM =objAllocateTr.Allocate2ButtonAssertion();
		    Assert.assertEquals(true , actualResultMM);
		    objAllocateTr.clickAllocate2();
		    Thread.sleep(5000);
		    
		    
		    }
		    
		    @Test(priority=4)
		    public void viewallocatedTrainer() throws InterruptedException, IOException{
		   
		   objview = new ViewAlloc(driver);
		   objview.clickviewalloc();
		  
		   String expectedurl1 =Trainermngmtconstants.url1;
		   String actualurl1 =driver.getCurrentUrl();
		   Assert.assertEquals(expectedurl1,actualurl1);

		  objview.clicksearch();
		  Thread.sleep(4000);

		  
		  ////Logout
		  
		  
		  
		   objadlogout = new Adminlogout(driver);
		   objadlogout.clicklogout();
		   Thread.sleep(4000);
		    
		   
		   String expectedurl2 =Trainermngmtconstants.url;
		   String actualurl2 =driver.getCurrentUrl();
		   Assert.assertEquals(expectedurl2,actualurl2);
		
		   
		    
		  	
		
}
}


		    
			
			
			
			
		
			
			
			

	

