package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class oneTest {
  @Test
  public void f1() {
	  Assert.assertFalse(true,"f1");
  }
  @Test
  public void f2() {
	  Assert.assertFalse(false,"f2");
}
}
