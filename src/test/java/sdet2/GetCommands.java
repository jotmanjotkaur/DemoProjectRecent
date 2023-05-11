package sdet2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCommands {
    public static void main(String[] args){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();


        driver.get("https://demo.guru99.com/test/newtours/"); //get method


        String title =  driver.getTitle(); //get
        System.out.println(title);

        System.out.println(driver.getCurrentUrl()); //get current url


        //check whether the date is present or not ( or any text present in web page )

        String date = driver.findElement(By.xpath(" //b[contains(text(),'Jul 6, 2017')]")).getText();
        System.out.println(date);





      //  driver.close();//current window close
            driver.quit(); // close multiple windows


    }
}
