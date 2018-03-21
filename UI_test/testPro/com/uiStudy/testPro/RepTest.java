package com.uiStudy.testPro;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class RepTest {
  @Test
  public void f1() {
	  Assert.assertFalse(true,"f1");
  }
  @Test
  public void f2() {
	  Assert.assertFalse(false,"f2");
}
