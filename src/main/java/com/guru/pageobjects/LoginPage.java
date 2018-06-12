package com.guru.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru.generic.BaseLib;

public class LoginPage extends BaseLib{

	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement PassWord;
	
	@FindBy(name="btnLogin")
	WebElement loginbutton;
	
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
	
	public void login(String uname, String pswrd){
		username.sendKeys(uname);
		PassWord.sendKeys(pswrd);
		loginbutton.click();
	}
}