package com.Syntax.Class05_ChBox_DropDwn_MultiSelectMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxDemo {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class  :on Mac you dont need .exe :on windows you need .exe
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
    }
}
