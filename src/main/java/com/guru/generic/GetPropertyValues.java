package com.guru.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetPropertyValues {
	static String filePath=".\\config.properties"; 
	
	public static String getValue(String key){
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream(new File(filePath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String value=prop.getProperty(key);
		return value;
	}
}
