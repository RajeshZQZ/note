package com.zentao.uiframework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardUtils {
	@SuppressWarnings("unused")
	private Actions action;
	
	public KeyBoardUtils(WebDriver dr){
		action = new Actions(dr);
	}
	
	public void pressDown(int time) {
		Robot robot;
		try {
			robot = new Robot();
			for(int i=0;i<=time;i++)
			{
				robot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void pressUp(int time) {
		Robot robot;
		try {
			robot = new Robot();
			for(int i=0;i<=time;i++)
			{
				robot.keyPress(KeyEvent.VK_UP);
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
