package com.Syntax.Class11_actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

public class actionClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //        maximize
        driver.manage().window().maximize();
        //  go to the https://www.amazon.com/ website
        driver.get("https://www.amazon.com/");
        // find the element EN
        WebElement enHover = driver.findElement(By.xpath("//div[text()='EN']"));
        // action Class
        Actions action = new Actions(driver);
        action.moveToElement(enHover).perform();    // hover mouse cursor to a web-element, then perform()


}}
