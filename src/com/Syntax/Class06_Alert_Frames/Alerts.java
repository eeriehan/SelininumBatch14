package com.Syntax.Class06_Alert_Frames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with our class  :on Mac you don't need .exe :on Windows you need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to 'syntaxprojects.com/javascript-alert-box-demo.php' website
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        //    driver.manage().window().maximize();

        //*************************** simple Alerts with one choice *****************

        //find the button click me for the alert and click on it
        WebElement simpleAlert = driver.findElement(
                By.xpath("//button[@onclick='myAlertFunction()']")
        );
        simpleAlert.click();
        Thread.sleep(3000);


        //handling the alert    :   switchTo().alert()  :   then assign to 'Alert' return type
        Alert simpleAlert1 = driver.switchTo().alert();     //<====== switching focus.
        simpleAlert1.accept();      //<====click ok.

        //*************************** Alerts with confirmation(ok or close buttons) *****************


        //find the button for confirmation alert and click on it

        WebElement confirmationAlert = driver.findElement(
                By.xpath("//button[@onclick='myConfirmFunction()']")
        );
        confirmationAlert.click();

        Alert confirmationAlert1 = driver.switchTo().alert();   //<====== switching focus.
        confirmationAlert1.dismiss();       //click cancel.

        //*************************** Alerts with send Text then send. **********************************

        WebElement promptAlert = driver.findElement(
                By.xpath("//button[@onclick='myPromptFunction()']")
        );
        promptAlert.click();

        Alert propm1 = driver.switchTo().alert();   //<====== switching focus.
        propm1.sendKeys("you will understand this someday.");
        propm1.accept();






    }
}
