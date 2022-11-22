package com.Syntax.Class01_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_navigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
      //  driver.navigate().to("https://www.facebook.com/");


        //introduce some sleep which means wait.
        //wait or pause for 2000 mil-seconds(2sec)
        Thread.sleep(2000); // throws InterruptedException
        //go back to google.com
    //    driver.navigate().back();   // as if pushed Back button

    //    Thread.sleep(2000);
    //    driver.navigate().forward();    // as if pushed Forward button

        //wait for 1 sec
    //    Thread.sleep(1000);
        //refresh the page
        driver.navigate().refresh();
        //Quit
        driver.quit();

    }
}
