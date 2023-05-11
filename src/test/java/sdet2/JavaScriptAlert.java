package sdet2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptAlert {

    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //Alert with Ok Button
/*
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();





  //Alert with ok and cancel button
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        Thread.sleep(3000);
      //  driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();

 */



        //Alert with input  box


         driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
         Thread.sleep(3000);

         Alert alert = driver.switchTo().alert();
         String message = alert.getText();
         System.out.println(message);

         alert.sendKeys("Java Script Alert");

         alert.accept();




    }
}
