package com.Syntax.Class12_JsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecutorHighLight {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // find the webElement username
        WebElement username = driver.findElement((By.id("txtUsername")));
        username.sendKeys("Admin");

        //        using js Executor
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px dotted blue'",username);

        //https://www.swtestacademy.com/javascriptexecutor-in-selenium/
        //reference site for javaScript executor.
    }
}
