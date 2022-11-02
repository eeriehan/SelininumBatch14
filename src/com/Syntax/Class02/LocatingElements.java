package com.Syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        String DRIVER_ID = "webdriver.chrome.driver";
        String DRIVER_PATH = "Drivers/chromedriver.exe";

        System.setProperty(DRIVER_ID, DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
//goto fb.com
        driver.get("https://www.facebook.com/");
//  maximize the window
        driver.manage().window().maximize();
/*enter the Username in the TextBox
      1.locate the element and send the keys*/
        driver.findElement(By.id("email")).sendKeys("syntax@syntax.com");
        driver.findElement(By.name("pass")).sendKeys("sellyoujobs");
//        driver.findElement(By.name("login")).click();     //click login button

     //   driver.findElement(By.linkText("Forgot password?")).click();    // how to locate linktext
        driver.findElement(By.partialLinkText("Forgot passw")).click();
        driver.quit();
    }
}
