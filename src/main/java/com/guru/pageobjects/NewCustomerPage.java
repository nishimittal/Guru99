package com.guru.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.guru.generic.BaseLib;

public class NewCustomerPage extends BaseLib {

	@FindBy(xpath = "//a[text()='New Customer']")
	WebElement NewCustomer;

	@FindBy(name = "name")
	WebElement CustName;

	@FindBy(xpath = "//input[@value='f']")
	WebElement femaleRadioButtn;

	@FindBy(name = "dob")
	WebElement dob;

	@FindBy(name = "addr")
	WebElement address;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "pinno")
	WebElement PinNo;

	@FindBy(name = "telephoneno")
	WebElement TelephoneNo;

	@FindBy(name = "emailid")
	WebElement EmailId;

	@FindBy(name = "password")
	WebElement Password;

	public NewCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnNewCustomerPage(WebDriver driver) {
		NewCustomer.click();
	}

	public void enterNewCustomerDetails(WebDriver driver) {
		CustName.sendKeys("Veeru");
		femaleRadioButtn.click();
		
	}

}
