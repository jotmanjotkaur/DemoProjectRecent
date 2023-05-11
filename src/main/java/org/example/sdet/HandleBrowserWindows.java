package org.example.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //getWindowHandle() - return the id of single browser window

     //  String parentID = driver.getWindowHandle();
    //   System.out.println(parentID);

        //getWindowHandles()-return the id of multiple browser windows

         Thread.sleep(3000);

         driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //open another browser window



        Set<String> windowIDs = driver.getWindowHandles();

        Iterator<String> it =windowIDs.iterator();
        String parentID =it.next();
        String childID=it.next();

        System.out.println("parent Id"+parentID);
        System.out.println("child Id"+childID);


        driver.switchTo().window(parentID);
        System.out.println("parent window title :"+driver.getTitle());


        driver.switchTo().window(childID);
        System.out.println("child window title :"+driver.getTitle());

    }
}
