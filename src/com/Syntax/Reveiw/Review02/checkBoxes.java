package com.Syntax.Reveiw.Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class  :on Mac you dont need .exe :on windows you need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to ebay website
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();

        //find the checkBoxes. and store in List<webElement> because working with multiple selection
        List<WebElement> checkbxes = driver.findElements(By.xpath("//input[@name='color']"));

        //what does this list contain?: it contains all the 6 WebElements
        for (WebElement checkBxes : checkbxes) {

            String buttonValue = checkBxes.getAttribute("value");

            if (buttonValue.equalsIgnoreCase("blue")) {
                checkBxes.click();
                break; //Optional but recommended breaks a loop cycle, stops wasting a cycle.
            }
        }
    }
}
