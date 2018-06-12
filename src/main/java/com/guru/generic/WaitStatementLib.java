package com.guru.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatementLib {

	public static void implicitWaitForSeconds(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}

	public static void implicitWaitForMinutes(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
		}
	
	public static void explicitWaitForVisibility(WebDriver driver, int time, WebElement ele){
		WebDriverWait wait= new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public static void explicitWaitForClikable(WebDriver driver, int time, WebElement ele){
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		}
	public static void isleep(int sec){
		int milliSec = 1000*sec;
		try {
			Thread.sleep(milliSec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
