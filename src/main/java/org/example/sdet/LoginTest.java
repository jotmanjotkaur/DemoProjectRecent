package org.example.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {
    public static void main (String[] args){

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");//open url
        //script for usernaame - <input type="text" name="userName" size="10">
        //for password - <input type="password" name="password" size="10">
        //for sign in - <input type="submit" name="submit" value="Submit" style="background-color: #FACB00;border: 1px solid black;font-family:MS Sans Serif;font-size:15px;">
        //locators - name , id , cssSelector , Xpath
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        //for sign in - <input type="submit" name="submit" value="Submit" style="background-color: #FACB00;border: 1px solid black;font-family:MS Sans Serif;font-size:15px;">
        //for sign in - <input type="submit" name="submit" value="Submit" style="background-color: #FACB00;border: 1px solid black;font-family:MS Sans Serif;font-size:15px;">
        driver.findElement(By.name("submit")).click();
        //title
        String exp_title ="Login: Mercury Tours";
        String act_title = driver.getTitle();//returns title of the page
        if(exp_title.equals(act_title)==true)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("Fail");
        }

driver.close();



    }
}
