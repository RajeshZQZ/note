package com.zentao.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.zentao.config.LocalConfig;
import com.zentao.uiframework.BasePage;
import com.zentao.uiframework.WebElementUtils;

public class LoginPage extends BasePage{
	private WebElement userName;
	private WebElement userPassword;
	private WebElement login;
	private Alert alert;
//	private WebElement keepLogin;
//	private WebElement languageDropdownMenu;
//	private WebElement forgetPasswordLink;
	public LoginPage(WebDriver dr){
		super(dr);
		openWeb(LocalConfig.URL);
		
		userName=findElement("css","input#account");
		userPassword=findElement("css","input[name='password']");
		login=findElement("css","button#submit");
//		keepLogin=driver.findElement(By.cssSelector("input#keepLoginon"));
//		languageDropdownMenu=driver.findElement(By.cssSelector("button.btn"));
//		forgetPasswordLink=driver.findElement(By.cssSelector("a[href='/zentao/user-reset.html']"));
	}	
	
	public MainPage loginOperate(String name,String password)
	{	
		input(userName,name);
		input(userPassword,password);
		click(login);
		return new MainPage(getDriver());
	}

	public String loginFileOperate(String name,String password) throws InterruptedException{
		input(userName,name);
		input(userPassword,password);
		click(login);
		wait(3);
		String value = getAlertText();
		alertAccept();
		return value;
	}

}

