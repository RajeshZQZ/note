package com.UItest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class submit {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("vae");
		Thread.sleep(2000);
		driver.findElement(By.id("kw")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("kw")).sendKeys("许嵩");
		Thread.sleep(2000);
		driver.findElement(By.id("kw")).submit();
		
		WebElement w1=driver.findElement(By.cssSelector("input#kw"));
		WebElement w2=driver.findElement(By.cssSelector("div#u1 a+a+a"));
		
		driver.findElement(By.id("kw")).sendKeys();

		
		
		
		
	}
}
