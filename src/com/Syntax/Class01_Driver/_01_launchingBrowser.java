package com.Syntax.Class01_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_launchingBrowser {
    public static void main(String[] args) {
        //Set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create a WebDriber instance
        WebDriver driver = new ChromeDriver();

        //use the get() function to open up the required website
        driver.get("https://www.google.com/");

        //get the url of the website
        String URL = driver.getCurrentUrl();

        //print the url
        System.out.println(URL);

        //Get the Title
        String title = driver.getTitle();

        //print the url
        System.out.println(title);

        //close the Chrome
        driver.quit();
    }
}