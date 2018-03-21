package com.UItest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://qzone.qq.com");
		driver.manage().window().maximize();
		
	    driver.switchTo().frame("login_frame");
		driver.findElement(By.cssSelector("div a#switcher_plogin.link")).click();
		driver.findElement(By.cssSelector("div input#u")).sendKeys("939546484");
		driver.findElement(By.cssSelector("div input#p")).sendKeys("{pig1478520");
		driver.findElement(By.cssSelector("div input#login_button")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.cssSelector("a#aIcenter")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("a[title='说说']")).click();
//		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div#$1_content_content")).sendKeys("this is a test!");
		driver.findElement(By.cssSelector("a.btn-post.gb_bt.evt_click")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
