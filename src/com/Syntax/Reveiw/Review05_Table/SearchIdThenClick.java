package com.Syntax.Reveiw.Review05_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchIdThenClick {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class    on Mac u don't need .exe on Windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();


        //  ********************* LOGIC FOR TABLE ************************


        // go to the table look for the ID 45156A, and click the checkBox Associated with it


        int rowCount = 0;
        boolean notFound = true;    // <- Flag

        while (notFound) {   // while() continues to execute till the condition in the paranthesis is 'True'

            //get all the data in the column ID of the table::::::::::::::need to be Dynamic. not hard code.
            List<WebElement> idColumn = driver.findElements(
                    By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (WebElement id : idColumn) {
                String personID = id.getText();

                if (personID.equals("41641A")) {
                    System.out.println("the row number of the desired id is " + (rowCount + 1));
                    WebElement checkBox = driver.findElement(
                            By.xpath("//table[@id='resultTable']/tbody/tr[" + (rowCount + 1) + "]/td[1]"));
                    checkBox.click();
                    notFound = false;   // <- Flag
                    break;
                }
                rowCount = rowCount + 1;
            }
            if (notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
                rowCount = 0; // <- reset Count after click to next page.

            }

        }
    }

}
