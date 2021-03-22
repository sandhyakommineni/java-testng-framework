package com.learnautomation.testcases;


import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.Helper;
//import com.learnautomation.utility.ExcelDataProvider;

public class LoginTestCRM extends BaseClass {
	
	@Test(priority=1)
	public void loginApp() 
	{
		
		//System.out.println(driver.getTitle());
		//ExcelDataProvider excel = new ExcelDataProvider();
		//excel.getStringData("Login", 0, 0);
		logger=report.createTest(" Login to CRM");
		
		LoginPage LoginPage=PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		 
		LoginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1), excel.getStringData("Login", 0, 2), excel.getStringData("Login", 0, 3));
		
		logger.pass("Loging success");
		
		//Helper.captureScreenshot(driver);
		
	}
	
	@Test(priority=2)
	public void loginApp1() 
	{
		
		//System.out.println(driver.getTitle());
		//ExcelDataProvider excel = new ExcelDataProvider();
		//excel.getStringData("Login", 0, 0);
		logger=report.createTest(" Logout");
		
		
		logger.fail("Loging Failed");
		
		//Helper.captureScreenshot(driver);
		
	}
}
