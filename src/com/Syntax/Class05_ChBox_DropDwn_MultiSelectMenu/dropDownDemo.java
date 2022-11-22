package com.Syntax.Class05_ChBox_DropDwn_MultiSelectMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class dropDownDemo {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with our class  :on Mac you dont need .exe :on windows you need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to syntaxprojects website
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");
        //Maximize
        driver.manage().window().maximize();

        //find the WebElement dropDown by looking for select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));
        //use select class provided by Seleninum
        Select select = new Select(dropDown);
        //====================================================Select Demo==================
        //select an option by index number
        select.selectByIndex(5);
        Thread.sleep(3000);

        //select an option by visible Text
        select.selectByVisibleText("Saturday");
        Thread.sleep(3001);

        //select an option by value (value tag)
        select.selectByValue("Sunday");
        Thread.sleep(3002);

        //get all the options available in the dropdown
        List<WebElement> options = select.getOptions();

        //traverse through the options
        for (int i = 0; i < options.size(); i++) {
            WebElement option = options.get(i);
            String text = option.getText();
            if (text.equalsIgnoreCase("Friday")) {
                select.selectByIndex(i);
            }
        }
    }
}
