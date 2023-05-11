package sdet2;

import Auto.DriverManager;
import org.example.DriverManager1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class FramesExample
        {
public static void main(String[] args) throws InterruptedException {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();




        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");



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


        driver.close();


    }
}
