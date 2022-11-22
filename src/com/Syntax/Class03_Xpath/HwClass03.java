package com.Syntax.Class03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwClass03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");   // open web-address, through 'chromedriver' object call 'driver'
        driver.manage().window().maximize();        // maximize() window size

        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();
        Thread.sleep(5000);
       // driver.findElement(By.xpath("//a[starts-with(text(),'Simple')][contains(@class,'group')]")).click();
        driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2])")).click();

        driver.findElement(By.xpath(
                "//a[@class='list-group-item' and @href='basic-first-form-demo.php']")).click();

        Thread.sleep(5000);
//Employee[@id='3'][contains(text(),'Tom')] <== i didnt know i could combind locator. fuck...
//a[@href='basic-first-form-demo.php'][starts-with(@class,'Simp'] <==not good
//a[text()='Simple Form Demo'][@class='list-group-item']
// a[starts-with(text(),'Simple')][contains(@class,'group')] <== this works. but only with Tread.sleep()
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("stress");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.quit();
    }
}

/*Navigate to http://syntaxprojects.com/
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser*/
