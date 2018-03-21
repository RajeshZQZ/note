package com.zentao.uiframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseUtils {
	private Actions action;
	//右击，双击，拖动，悬停。。。
	public MouseUtils(WebDriver dr){
		action = new Actions(dr);
	}
	
	public void rightClick(WebElement e){
		action.contextClick(e).perform();
	}
	
	public void doubleClick(WebElement e){
		action.doubleClick(e).perform();
	}
	
}
