package com.zentao.uiframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils extends BrowserUtils{

	public WebElementUtils(WebDriver dr) {
		super(dr);
	}
	
	public WebElement getElement(String by,String locatorValue){
		WebElement el=null;
		switch(by){
		case "id":
			el = driver.findElement(By.id(locatorValue));
			break;
		case "name":
			el = driver.findElement(By.name(locatorValue));
			break;
		case "xpath":
			el = driver.findElement(By.xpath(locatorValue));
			break;
		case "css":
			el = driver.findElement(By.cssSelector(locatorValue));
			break;	
		}
		return el;
	}
	
	public WebElement findElement(final String by,final String locatorValue){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement el = wait.until(new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver d){
				return getElement(by, locatorValue);
			}	
		}); 	
		return el;
	}
	
	public void click(WebElement e){
		e.click();
	}
	
	public void input(WebElement e,String content){
		e.sendKeys(content);
	}
	
	public void summit(WebElement e){
		e.submit();	
	}
	
	public String getTxet(WebElement e){
		return e.getText();
	}
	
	public String getAttribute(WebElement e,String attribute){
		return e.getAttribute(attribute);	
	}
	

}
