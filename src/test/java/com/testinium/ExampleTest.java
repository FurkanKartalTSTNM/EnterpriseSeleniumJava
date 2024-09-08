package com.testinium;

import org.junit.jupiter.api.Test;

public class ExampleTest extends BaseTest {

Steps steps = new Steps();

@Test
public void exampleTest() {
    steps.goToPage("https://www.amazon.com.tr/");
    steps.waitSeconds(5);
    steps.goToPage("https://www.hepsiburada.com/");
    steps.waitSeconds(5);
    steps.goToPage("https://www.trendyol.com/");
    steps.waitSeconds(5);
    steps.goToPage("https://www.n11.com/");
    steps.waitSeconds(5);
    steps.findElement("twotabsearchtextbox").sendKeys("bilgisayar");
    }
}
