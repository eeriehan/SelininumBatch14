package com.Syntax.Class11_actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        //  switch the focus to the iframe
        driver.switchTo().frame(0);

        //  draggable
        WebElement draggableElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        //  drop location
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(driver);

        // option 1
        action.dragAndDrop(draggableElement, dropLocation).perform();
        // option 2
        //action.clickAndHold(draggableElement).moveToElement(dropLocation).release().build().perform();

    }
}

