package com.guru.scripts;

import java.io.IOException;

import org.testng.annotations.Test;
import com.guru.generic.BaseLib;
import com.guru.generic.ExcelUtils;
import com.guru.generic.ScreenshotHandle;
import com.guru.pageobjects.LoginPage;

public class LoginTest extends BaseLib {
	// WebDriver driver;
	@Test(priority = 1)
	public void validLoginTest() throws InterruptedException, IOException {

		LoginPage lp = new LoginPage(driver);
		String username = ExcelUtils.readData("Sheet1", 1, 1);
		String password = ExcelUtils.readData("Sheet1", 1, 2);
		lp.login(username, password);
		System.out.println("Login Successfull");
		lp.verifyvalidUserId(driver);
		lp.verifyHomePageTitle(driver);
	}

	@Test(priority = 2)
	public void invalidLoginTest() throws Exception {
		LoginPage lp = new LoginPage(driver);
		String username = ExcelUtils.readData("Sheet1", 2, 1);
		String password = ExcelUtils.readData("Sheet1", 2, 2);
		lp.login(username, password);
		System.out.println("Login Unsuccessfull");
		Thread.sleep(5000);

		lp.verifyInvalidLoginMsg(driver);

	}
}
