package sdet2;

import Auto.DriverManager;
import org.example.DriverManager1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FrameExample
{

    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = DriverManager1.getDriver();

        //1st Frame
        driver.switchTo().frame("packageListFrame");//name of the frame
        driver.findElement(By.linkText("org.openqa.selenium")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(5000);



        //2nd Frame
        driver.switchTo().frame("packageFrame");//name of the frame
        driver.findElement(By.linkText("WebDriver")).click();
        driver.switchTo().defaultContent(); //go back to main page
        Thread.sleep(5000);





        //3rd Frame

        driver.switchTo().frame("classFrame");//name of the frame
        driver.findElement(By.linkText("org.openqa.selenium")).click();



     }


}
