package KiteTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BAse.BaseClass;
import POm_classes.Pom_class1;
import POm_classes.Pom_class2;
import POm_classes.Pom_class3;
import Utility.Utilityclass;

public class Test_class extends BaseClass {
	//declare all useful members as global
	
			
			Pom_class1 login1;
			Pom_class2 login2;
			Pom_class3 home;
			
		@BeforeClass
		public void openBrowser() throws Throwable {
			initilizeBrowser();
		    
		    //all objects of POM class
		    login1=new Pom_class1(driver);
		     login2=new Pom_class2(driver);
		     home=new Pom_class3(driver);
		}
		@BeforeMethod
		public void loginToApp() throws Throwable {
			//enter un
			 
			 login1.enterUN(Utilityclass.getTD(0, 0));//DPG458
			 System.out.println((Utilityclass.getTD(0, 0)));
			 
			 //enter pwd
			
			login1.enterPWD(Utilityclass.getTD(0, 1));
			//clck on login btn
			login2.clickcntBtn();
			
			//enter pin
			
			login2.enterPIN(Utilityclass.getTD(0, 2));
			//click on continue btn
			login2.clickcntBtn();
		}
		@Test
		public void verifyuserID() throws Throwable {
			Reporter.log("running verify user id",true);
			String actID = home.verifyuserID();
			 String expID=Utilityclass.getTD(0, 0);
			Assert.assertEquals(expID,actID,"both are different tc is failed");
		}
		@AfterMethod
		public void logoutApp() {
			Reporter.log("logout the application",true);
		}
		@AfterClass
		public void closeBrowser() {
			Reporter.log("close the app",true);
		}

}   sysytem.out.println("nck");
