package com.Syntax.Class07_WinHandle_implWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandlingAdvance {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class    on Mac u don't need .exe on Windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //task : goto gmail signup and get the window handle
        //goto gmail signup page
        driver.get("http://accounts.google.com/signup");

        //click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        // click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        //The title of my desired page is 'Google Account Help'  :  do it manually. on top inside "title"
        // get all the window handles
        Set<String> allHandles = driver.getWindowHandles();

        //Switching the focus to the current handle from list       using fucking loop
        for (String handle : allHandles) {
            //get the title of the window to which the driver has switched
            driver.switchTo().window(handle);
            String title = driver.getTitle();

            //compare if the title is of the help
            if (title.equalsIgnoreCase("Google Account Help")) { //manually retrieved title earlier
                System.out.println("the current page under focus is " + title);
                break;
            }

        }
        // find the community button and click on it
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()'Community']"));
        communityBtn.click();


    }
}