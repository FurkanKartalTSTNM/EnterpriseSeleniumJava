package com.testinium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleTest extends BaseTest {

    private WebDriver driver;
    Steps steps = new Steps();

@Test
public void exampleTest() {
    // Chrome driver başlatma
    driver = new ChromeDriver();
    driver.get("https://www.amazon.com.tr/");

    // WebDriverWait kullanarak elementin görünmesini bekleme
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement logo = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-logo-sprites")));

    // Elemente tıklama
    logo.click();

    // Tarayıcıyı kapatma
    driver.quit();
    }
}
