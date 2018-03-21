package com.zentao.config;

import com.zentao.utils.PropertiesUtils;

public class LocalConfig {
	static PropertiesUtils propertiesUtils = new PropertiesUtils("local.properties");
	public static final String URL = propertiesUtils.getPropertiesValue("url");
	public static final String CHROME_DRIVER = propertiesUtils.getPropertiesValue("chromeDriverPath");
}