package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager1 {
    public static WebDriver driver =null;

    public static WebDriver getDriver()
    {
        if ( driver ==null)
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriver driver=new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        }
        return driver;
    }
}
