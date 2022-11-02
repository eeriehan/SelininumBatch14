package com.Syntax.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_maximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //maximize:: driver.manage().window().maximize();

        //fullscreen
    //    driver.manage().window().fullscreen();
        driver.quit();      // quit
    }
}
