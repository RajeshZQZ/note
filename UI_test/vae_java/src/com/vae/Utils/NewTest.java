package com.vae.Utils;

import org.testng.Assert;
import org.testng.annotations.Test;



public class NewTest {
	calc ca=new calc();
  @Test
  public void f1()
  {
	Assert.assertEquals(ca.add(10, 8),15);
  }
  @Test
  public void f2()
  {
	Assert.assertEquals(ca.add(7, 8),15);
  }
  @Test
  public void f3()
  {
	Assert.assertEquals(ca.minus(10, 8),5);
  }
  @Test
  public void f4()
  {
	Assert.assertEquals(ca.minus(10, 8),2);
  }
  
}

