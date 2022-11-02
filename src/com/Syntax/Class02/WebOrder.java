package com.Syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        //Make sure that the title is correct:: Web Orders
        String title = driver.getTitle();
        //System.out.println(title);

        if (title.equalsIgnoreCase("Web Orders")) {
            System.out.println("The title is correct : " + title);
        } else {
            System.out.println("The title is incorrect : " + title);
        }

        driver.wait(5000);
        driver.quit();
    }
}
