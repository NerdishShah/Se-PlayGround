package com.ecom.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropReader {
	private String fileName;
	InputStream inputStream;
	Properties prop;

	public PropReader(String fileName) {
		this.fileName = fileName;
		prop = new Properties();
		loadProperty();
	}

	private void loadProperty() {
		try {
			inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("proprty file '" + fileName + "' not found in classpath");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		return prop.getProperty(key);
	}

}
