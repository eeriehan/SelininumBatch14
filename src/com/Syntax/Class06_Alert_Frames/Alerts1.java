package com.Syntax.Class06_Alert_Frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with our class  :on Mac you don't need .exe :on Windows you need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to 'https://the-internet.herokuapp.com/basic_auth' website
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        //    driver.manage().window().maximize();

        // ?????????????????????
    }
}
