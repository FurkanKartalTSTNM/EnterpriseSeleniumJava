package com.testinium.base;

import com.testinium.BasePage;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {

  private Logger logger = LoggerFactory.getLogger(getClass());
  private final String URL = "http://localhost:4444/wd/hub";
  private RemoteWebDriver driver;

  @Before
  public void setUp() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("browserName", "chrome");
    try {
      capabilities.setCapability("key", System.getProperty("key"));
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      driver = new RemoteWebDriver(new URL(URL), capabilities);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testCase() {
    logger.info("Start test");
    BasePage basePage = new BasePage(driver);
    basePage.setPageTimeOut(30);
    basePage.setImplicitlyWait(10);
    basePage.fullScreen();
    basePage.goToUrl("http://www.hepsiburada.com/");
    basePage.click(By.id("myAccount"));
    basePage.findByClickable(By.id("login")).click();
    basePage.close();
    basePage.waitSeconds(1);
    logger.info("test");
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
