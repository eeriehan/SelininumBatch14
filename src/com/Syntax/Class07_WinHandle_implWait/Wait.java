package com.Syntax.Class07_WinHandle_implWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class    on Mac u don't need .exe on Windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // 20 IS MAXIMUM. when worked, break
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        // click on the start button
        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();

        // find the text
        WebElement welcomeText = driver.findElement(
                By.xpath("//h4[text()='Welcome Syntax Technologies']")
        );
        String text = welcomeText.getText();
        System.out.println("the text is :" + text);

        // implicit wait is going to wait until the element is found. give error if not found

    }
}
