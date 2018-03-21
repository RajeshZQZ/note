package com.zentao.utils;

import org.junit.Assert;

public class AssertUtils {
	//整型比较、字符串比较、字符串包含、非空、实型断言
	public void checkIntNum (int actual,int expected,String... com){
		Assert.assertEquals(expected, actual);
	}
	
	public void checkString (String actual,String expected,String... com){
		Assert.assertEquals(expected, actual);
	}
	
	public void checkStringContians (String actual,String expected,String... com){
		Assert.assertEquals(true, actual.contains(expected));
	}
	
	public void checkNotNull (Object actual,String... com){
		Assert.assertNotNull(actual);
	}
}
