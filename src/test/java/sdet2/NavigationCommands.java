package sdet2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationCommands {

    public static void main(String[] args)
    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/newtours/");
        System.out.println(driver.getTitle());
        //step 1

        driver.navigate().to("https://www.facebook.com/"); //step 2
        System.out.println(driver.getTitle());


        driver.navigate().back(); //step 3
        System.out.println(driver.getTitle());



        driver.navigate().forward(); //step 4
        System.out.println(driver.getTitle());
        driver.navigate().refresh();


        driver.close();


    }
}
