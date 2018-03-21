package com.zentao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	private WebDriver driver;
	private WebElement userMenu;
	
	public MainPage(WebDriver dr){
		this.driver=dr;
		this.userMenu=driver.findElement(By.cssSelector("div#userMenu.dropdown a"));
	}
	
	public String getLoginUserName(){
		return userMenu.getText();
	}
}

