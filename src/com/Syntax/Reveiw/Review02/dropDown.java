package com.Syntax.Reveiw.Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with our class  :on Mac you dont need .exe :on windows you need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to facebook website
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
//===========================================================================================================
        //find the button, create account and click on it
        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        //sleep for 3sec to wait for the window to open up
        Thread.sleep(3000);

        //select date from the down
        //approadch to use the select(class)

        //1.    find the webElement that contains the select Tag
        WebElement selDay = driver.findElement(By.xpath("//select[@id='day']"));

        //2.    use Select class:    Select sel = new Select(Webelement);
        Select sel = new Select(selDay);

        //We have now three methods
        //1.    select by index (#)
        sel.selectByIndex(4);
        Thread.sleep(2000);

        //2.    select by visible Text (white colored text)
        sel.selectByVisibleText("15");
        Thread.sleep(2000);

        //3.    select by Value (orange colored text)
        sel.selectByValue("16");
        Thread.sleep(2000);

        //=======================================================================

        //1.    find the WebElement
        //2.    use the select class to initiate

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select selMonth = new Select(month);
        selMonth.selectByVisibleText("Aug");
        Thread.sleep(2000);

        //print all the available months in the console
        List<WebElement> month1 = driver.findElements(By.xpath("//select[@id='month']"));

        //Loop through List and print all available options
        for (WebElement monthLoop : month1) {
            String monthAll = monthLoop.getText();
            System.out.println(monthAll);
        }
        Thread.sleep(2000);
        driver.quit();
    }
}

