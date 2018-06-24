package com.guru.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.junit.Assert;
import com.guru.generic.BaseLib;

public class LoginPage extends BaseLib {

	@FindBy(name = "uid")
	WebElement username;

	@FindBy(name = "password")
	WebElement PassWord;

	@FindBy(name = "btnLogin")
	WebElement loginbutton;

	@FindBy(xpath = "//td[text()='Manger Id : mngr137081']")
	WebElement userid;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login(String uname, String pswrd) {
		username.sendKeys(uname);
		PassWord.sendKeys(pswrd);
		loginbutton.click();
	}

	public void verifyHomePageTitle(WebDriver driver) {
		String act = driver.getTitle();
		String exp = "Guru99 Bank Manager HomePage";
		Assert.assertEquals(exp, act);
		Reporter.log("Home Page Title is verified", true);
	}

	public void verifyvalidUserId(WebDriver driver) {
		Assert.assertTrue(userid.isDisplayed());
		System.out.println("Manager Id is displaying successfully :" + userid.getText());
	}

	public void verifyInvalidLoginMsg(WebDriver driver) {

		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		String expectedBoxTitle = "User or Password is not valid";
		Assert.assertEquals(expectedBoxTitle, alertMessage);
		System.out.println("Alert message verification is successfull");
		alert.accept();
	}

}