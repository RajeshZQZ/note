package com.zentao.uiframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

	protected WebDriver driver;
	private static MouseUtils mouse;
	
	public BrowserUtils(WebDriver dr){
		this.driver = dr;
		mouse = new MouseUtils(driver);
	}
	public void openWeb(String url){
		driver.get(url);
//		log.info(""+url);
	}
	public void closeWeb() {
		driver.close();
	}
	
	public void quit(){
		driver.quit();
	}
	
	public void back(){
		driver.navigate().back();
	}
	
	public void forword(){
		driver.navigate().forward();
	}
	
	public void refresh(){
		driver.navigate().refresh();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public String getCrrentUrl(){
		String crrentUrl = driver.getCurrentUrl();
		return crrentUrl;
	}
	
	public void wait(int seconds){
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
//	public void swthichToWindow(int index){
//		String[] handls = new String[driver.getWindowHandle()];
//		driver.getWindowHandles().toArray(handls);
//		driver.switchTo().window(handls[index]);	
//	}
	
}
