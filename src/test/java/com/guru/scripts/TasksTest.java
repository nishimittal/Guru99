package com.guru.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.guru.generic.BaseLib;
import com.guru.generic.ExcelUtils;
import com.guru.pageobjects.LoginPage;
import com.guru.pageobjects.NewCustomerPage;

public class TasksTest extends BaseLib {
	@Test(priority = 1)
	public void validLoginTest() throws InterruptedException, IOException {

		LoginPage lp = new LoginPage(driver);
		String username = ExcelUtils.readData("Sheet1", 1, 1);
		String password = ExcelUtils.readData("Sheet1", 1, 2);
		lp.login(username, password);
		System.out.println("Login Successfull");

		NewCustomerPage ncp = new NewCustomerPage(driver);
		ncp.clickOnNewCustomerPage(driver);
		String custname = ExcelUtils.readData("Sheet1", 1, 3);
		
		
		String dob = ExcelUtils.readData("Sheet1", 1, 5);
		 String address = ExcelUtils.readData("Sheet1", 1, 6);
		 String city = ExcelUtils.readData("Sheet1", 1, 7);
		 String state = ExcelUtils.readData("Sheet1", 1, 8);
		  int pin = ExcelUtils.readData("Sheet1", 1, 9);
		 String mobileno = ExcelUtils.readData("Sheet1", 1, 10);
		 String email = ExcelUtils.readData("Sheet1", 1, 11);
		 String pswrd = ExcelUtils.readData("Sheet1", 1, 12);
		ncp.enterNewCustomerDetails(driver);		
	}
}
