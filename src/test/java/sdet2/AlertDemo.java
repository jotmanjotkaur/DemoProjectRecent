package sdet2;

import Auto.DriverManager;
import org.example.DriverManager1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertDemo {

    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.get("http://omayo.blogspot.com/");


        driver.findElement(By.id("alert1")).click();

        Alert alert = driver.switchTo().alert();//switch to alert

         Thread.sleep(5000);

        String textOnAlert =  alert.getText();

        System.out.println(textOnAlert);

        alert.accept();

  //   alert.dismiss();

        driver.close();


    }
}
