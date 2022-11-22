package com.Syntax.Reveiw.Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class  :on Mac you don't need .exe :on Windows you need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to ebay website
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //find the radio button. and store in List<webElement> because working with multiple selection
        List<WebElement> radioButton = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        //traverse through the list of webElements
        for (WebElement radioBtn : radioButton) {

            //find the desired radio button
            String option = radioBtn.getAttribute("value");

            if (option.equalsIgnoreCase("5 - 15")) {
                //click on selected
                radioBtn.click();
            }
        }
    }
}
