package com.Syntax.Class08_WaitTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tableBasics {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//create a WebDriver instance
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// Add implicit wait
        driver.manage().window().maximize();// Maximize window
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        // print the whole table
        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textAllTable = allTable.getText();
        System.out.println(textAllTable);

        // print all the rows of the table    :   row level access 1
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : rows) {
            String rowText = row.getText();
            System.out.println(rowText);
            System.out.println("-1-------------------------------------");
        }

        // modification.: print all the rows which have the company google    :   row level access 2
        List<WebElement> rows2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : rows2) {
            String rowText = row.getText();
/*            System.out.println(rowText);
            System.out.println("--2------------------------------------");*/

            if (rowText.contains("Google")) {
                System.out.println(rowText + " <--2-------------------this");
                System.out.println("------ ----------- --------------");
            }
        }

        // modification.: print all the column which have the company google    :   column level access
        List<WebElement> rows3 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement row : rows3) {
            String columnText = row.getText();
            System.out.println(columnText);
            System.out.println("-3-------------------------------------");
        }
    }
}
