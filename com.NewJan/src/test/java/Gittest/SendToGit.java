package Gittest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SendToGit {
  @Test
  public void f() {
	  System.out.println("test in progress");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Test started");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("test end");
  }

}
