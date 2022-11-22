package com.Syntax.Class03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        String DRIVER_ID = "webdriver.chrome.driver";
        String DRIVER_PATH = "Drivers/chromedriver.exe";

        System.setProperty(DRIVER_ID, DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");
//@type
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
        //get me the tagname 'input' which has id that is 'email'

//text()
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
        //get me the tagname 'a' which has text that is "Forgot password?"

//contains()
      //contains type
        driver.findElement(By.xpath("//button[contains(@type, 'sub')]")).click();
        //  1.  long attribute value
        //  2.  some part is dynamic of the attribute value.  id="asdf1234", we can skip part that is dynamic. like #s.
      //contains text()
        driver.findElement(By.xpath("//a[contains(text(), 'forgot ')]")).click();

//starts-with(@name, 'pa')          instead of 'password'
        driver.findElement(By.xpath("//input[starts-with(@name, 'pa')]")).click();
    }}
