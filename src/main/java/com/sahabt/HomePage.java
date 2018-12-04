package com.sahabt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }

  public HomePage search(String searchWord) {
    sendKeys(By.cssSelector("input[role='combobox']"), searchWord);
    sendKeys(By.cssSelector("input[role='combobox']"), Keys.ENTER);
    waitSeconds(1);
    return this;
  }
}
