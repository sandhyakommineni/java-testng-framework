package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "userName")
	WebElement uname;

	/*
	 * This is to fail the testcase to take screenshot we have to change "userName1"
	 
	 @FindBy(id="userName1") WebElement uname;
	 */

	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement email;

	@FindBy(id = "currentAddress")
	WebElement caddress;

	@FindBy(id = "permanentAddress")
	WebElement paddress;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitbtn;

	public void loginToCRM(String userName, String useremail, String cadd, String padd) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		uname.sendKeys(userName);
		email.sendKeys(useremail);
		caddress.sendKeys(cadd);
		paddress.sendKeys(padd);

		submitbtn.submit();

	}
}
