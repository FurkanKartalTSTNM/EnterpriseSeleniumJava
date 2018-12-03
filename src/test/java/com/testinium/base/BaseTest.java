package com.testinium.base;

import com.testinium.BasePage;
import com.testinium.HomePage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
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
  private final String URL = "http://hub.testinium.io/wd/hub";
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
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().fullscreen();
    driver.get("http://www.google.com/");
  }

  @Test
  public void searchCase() {
    HomePage homePage = new HomePage(driver);
    homePage.search("testinium");
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
