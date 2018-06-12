package com.guru.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotHandle {
	
	public void takeScreenshot(String filename, WebDriver driver) throws IOException{
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\Screenshots\\"+filename+".png");
		FileUtils.copyFile(srcfile, destFile);
	}

}
