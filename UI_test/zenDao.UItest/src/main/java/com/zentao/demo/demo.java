package com.zentao.demo;

import org.openqa.selenium.WebDriver;

import com.zentao.uiframework.DriverFactory;



public class demo {

	public static void main(String[] args) {
//		PropertiesUtils p = new PropertiesUtils("local.properties");
//		String url = p.getPropertiesValue("url");
//		System.out.println(url);

     WebDriver driver = DriverFactory.getChromeDriver();
    driver.get("https://www.baidu.com");
//		String d = System.getProperty("user.dir");	
//		System.out.println(d+"\\Driver\\chromedriver.exe\\");
	}
}
