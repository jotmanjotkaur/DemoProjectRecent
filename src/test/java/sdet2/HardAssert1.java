package sdet2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.SchemaOutputResolver;

public class HardAssert1 {

  @Test
  void loginTest()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();




        driver.get("https://demo.guru99.com/test/newtours/"); //open url



        WebElement username = driver.findElement(By.name("userName"));
        WebElement password=driver.findElement(By.name("password"));


        //check whether the text box is displayed or not
        //Test will cont. if below statement is true
/*
        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("Mercury");



        Assert.assertTrue(password.isDisplayed());
       password.sendKeys("Mercury");


 */



        Assert.assertFalse(username.isDisplayed());
        username.sendKeys("Mercury");



        Assert.assertFalse(password.isDisplayed());
        password.sendKeys("Mercury");
        driver.findElement(By.name("submit")).click();




      String ExpTitle="Login: Mercury Tours";
      Assert.assertEquals(ExpTitle,driver.getTitle());

        System.out.println(" Task  Complete ");


        driver.close();



    }
}
