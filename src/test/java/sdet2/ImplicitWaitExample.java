package sdet2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ImplicitWaitExample {


    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.findElement(By.name("q")).sendKeys("Selenium"); //  Search
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN); //Enter

        driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();


//explicit wait

    }
}
