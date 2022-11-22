package com.Syntax.Class07_WinHandle_implWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWaits {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class    on Mac u don't need .exe on Windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // 20 IS MAXIMUM. when worked, break
        driver.get("http://www.facebook.com/");

        // go to faceBook.com
        WebElement createNewAccountBtn = driver.findElement(
                (By.xpath("//a[text()='Create new account']"))
        );
        createNewAccountBtn.click();

        // Send the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("glimpsOfUs");   // w/o implicitly implement wait. .sendKeys wouldn't work.
/*
    implicit:   driver.manage().timeouts().implicitlyWait(timeout time, Units);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.seconds);

        -implicit wait is a global wait -> We need to define it only once before the start of out code,
         and it is going to be waiting for every element that takes time to be found
*/

    }
}
