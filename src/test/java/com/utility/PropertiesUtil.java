package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	public static String ReadProperty(String propertyName) {
		File readFile = new File(System.getProperty("user.dir")+ "\\Config\\CONFIG.properties");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(readFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties properties = new Properties();
		try {
			properties.load(fileReader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = properties.getProperty(propertyName);
		return value;
	}
}
