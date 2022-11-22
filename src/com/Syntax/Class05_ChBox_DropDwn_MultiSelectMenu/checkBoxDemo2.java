package com.Syntax.Class05_ChBox_DropDwn_MultiSelectMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxDemo2 {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class  :on Mac you don't need .exe :on Windows you need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to syntaxprojects website
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        //find the checkbox
        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
        //click on it
        checkBox.click();

        //find all the checkboxes       List<E>
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        //traverse through list of checkboxes to find the desired one
        for (WebElement checkBoxLoop : checkBoxes) {
            //get the attribute value to check if this is the right option to select
            String optionName = checkBoxLoop.getAttribute("value");
            //if condition to make sure it is the right checkbox
            if (optionName.equalsIgnoreCase("Option-2")) {
                //if passed click on it
                checkBoxLoop.click();
            }
        }
    }
}
