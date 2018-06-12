package com.guru.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.guru.generic.BaseLib;
import com.guru.generic.ExcelUtils;
import com.guru.pageobjects.LoginPage;

public class LoginTest extends BaseLib {
 //WebDriver driver;
	@Test(priority = 1)
	public void validLoginTest() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		String username = ExcelUtils.readData("Sheet1", 1, 1);
		String password = ExcelUtils.readData("Sheet1", 1, 2);
		lp.login(username, password);
	
	}
}
