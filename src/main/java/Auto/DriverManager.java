package Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    public static WebDriver driver =null;

    public static WebDriver getDriver()
    {
        if ( driver ==null)
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("disable-infobars");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable - automation"});

            WebDriver driver=new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }
}
