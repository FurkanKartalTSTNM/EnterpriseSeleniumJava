package com.testinium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ExampleTest extends BaseTest {

Steps steps = new Steps();

@Test
public void exampleTest() {
    steps.goToPage("https://www.amazon.com.tr/");
    driver.findElement(By.xpath("//a[1]")).click();
    steps.waitSeconds(2);
    driver.findElement(By.id("nav-logo-sprites")).click();
    steps.waitSeconds(2);
    driver.findElement(By.id("nav-global-location-popover-link")).click();
    steps.waitSeconds(2);
    driver.findElement(By.cssSelector(".a-button-close.a-declarative")).click();
    steps.waitSeconds(2);
    }
}
