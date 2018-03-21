package com.zantao.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zentao.pages.LoginPage;
import com.zentao.pages.MainPage;
import com.zentao.uiframework.DriverFactory;
import com.zentao.utils.AssertUtils;


public class loginTest {
	WebDriver driver ;
	AssertUtils assertUtils ;
	@BeforeMethod 
	public void SetUp(){
		assertUtils = new AssertUtils();
		driver = DriverFactory.getChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
  @Test
  public void LoginTest1() throws Exception {
	  LoginPage lp = new LoginPage(driver);
	  MainPage mp = lp.loginOperate("admin","123456");
	  String value = mp.getLoginUserName();
	  assertUtils.checkStringContians(value, "admin","登录失败" );
//	  Assert.assertEquals(value.contains("admin"),true,"登录失败");
  }
  @Test
  public void LoginTest2() throws Exception{
	  LoginPage lp = new LoginPage(driver);
	  String value = lp.loginFileOperate("admin","1234");
	  assertUtils.checkStringContians(value, "登录失败","登录测试失败" );
//	  Assert.assertEquals(value.contains("登录失败"),true,"登录测试失败");
  }
  @AfterMethod
  public void tearDown() throws InterruptedException{
	  Thread.sleep(2000);
      driver.quit();
  }	
  
}
