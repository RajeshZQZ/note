package com.UItest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class01 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://192.168.0.134/phpwind/index.php");
		driver.findElement(By.id("J_username")).sendKeys("admin");
		driver.findElement(By.id("J_password")).sendKeys("123456");
		driver.findElement(By.id("J_sidebar_login")).click();
		Thread.sleep(3000);
	    driver.findElement(By.linkText("版块")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("新版块")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.className("btn_post J_thread_post_btn")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("J_atc_title")).sendKeys("VAE");
	    Thread.sleep(3000);
	    driver.findElement(By.className("editor_content")).sendKeys("VAE IS A SINGER");
	    Thread.sleep(3000);
	    driver.findElement(By.id(" J_post_sub")).click();
	}

}
