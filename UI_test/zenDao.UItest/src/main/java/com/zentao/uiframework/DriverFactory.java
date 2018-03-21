package com.zentao.uiframework;

import java.io.IOException;
import java.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.zentao.config.LocalConfig;

public class DriverFactory {

	private static WebDriver driver;
	static Runtime runtime = Runtime.getRuntime();
	
	public static WebDriver getChromeDriver(){
		try {
			runtime.exec("taskkill /F /IM chrome.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String driverPath = System.getProperty("user.dir")+LocalConfig.CHROME_DRIVER;
//		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver",driverPath);
	    ChromeOptions options = new ChromeOptions(); 
	    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	    capabilities.setCapability("chrome.swthiches",Arrays.asList("--start-maximized"));
	    options.addArguments("--test-type","--start-maximized");
	    driver = new ChromeDriver();
	    return driver;
	}
}
