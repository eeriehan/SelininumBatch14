package com.Syntax.PracticeSeleninum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01Basic {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        String URL = driver.getCurrentUrl();            //store current url to variable
        System.out.println(URL);
        String title = driver.getTitle();               //store current title to variable
        System.out.println(title);

        driver.manage().window().maximize();            //Maximize window size.

    //    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
    //    driver.findElement(By.linkText("https://www.google.com/")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));






        Thread.sleep(4320); // throws InterruptedException, works with any int#, 1000 = 1second

        driver.quit();

    }
}
