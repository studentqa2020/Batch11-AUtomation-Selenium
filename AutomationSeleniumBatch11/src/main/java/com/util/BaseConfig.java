package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	
	public static String getConfigValue(String value) throws IOException {
		File file = new File("./Config.properties");
		FileInputStream fis = new FileInputStream(file);

		Properties ps = new Properties();
		ps.load(fis);
		
		String data =ps.getProperty(value);
		//System.out.println(data);
		return data;
		
	}
	
	public static void main(String[] args) throws IOException {
	
		System.out.println(BaseConfig.getConfigValue("URL"));
		
	}

}
