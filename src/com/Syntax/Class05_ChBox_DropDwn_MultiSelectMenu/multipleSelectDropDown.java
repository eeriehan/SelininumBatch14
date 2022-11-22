package com.Syntax.Class05_ChBox_DropDwn_MultiSelectMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with our class  :on Mac you don't need .exe :on Windows you need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to syntaxprojects website
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");
        //Maximize
        driver.manage().window().maximize();
        //============================================Multiple drop down=========

        //find the WebElement that contains the select class
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

        //using select class
        Select sel = new Select(DD);

        //By index
        sel.selectByIndex(3);   //New york

        //By visible Text
        sel.selectByVisibleText("Texas");
        Thread.sleep(3000);

        //deselect by index
        sel.deselectByIndex(3);

        //select all the options. using loop
        List<WebElement> DDList = sel.getOptions(); //getOptions() will return all the available option in the DD
        for (int i = 0; i < DDList.size(); i++) {
            sel.selectByIndex(i);
        }
        Thread.sleep(3000);

        //deselectAll
        sel.deselectAll();

        //how to check if the drop-down is multiple-select or single-select.
        //sel.isMultiple();
        boolean multiSelect = sel.isMultiple();
        System.out.println(multiSelect);
    }
}
