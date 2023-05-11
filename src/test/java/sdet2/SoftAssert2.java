package sdet2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert2 {

    SoftAssert softAssert1= new SoftAssert();
    SoftAssert softAssert3= new SoftAssert();
    @Test
    void demoTest1()
    {
        softAssert1.assertEquals("welcome" , "wel"); //false - failed
        softAssert1.assertAll();
    }

    @Test
    void demoTest2()
    {
        softAssert3.assertEquals("welcome" , "welcome"); //true - passed
        softAssert3.assertAll();
    }






    }



