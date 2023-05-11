package sdet2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
    WebDriver driver;
@BeforeClass
@Parameters({"Browser","url"})
    void setup( String Browser, String aap)
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
@Test
    void logoTest()
    {
    WebElement logo =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
        Assert.assertTrue(logo.isDisplayed(),"logo is not displayed on the page");

    }
@Test
    void title()
    {
        String Titlehome =driver.getTitle();
        Assert.assertEquals(Titlehome,"OrangeHrm", "Title not matched");

    }


@AfterClass
    void teardown()
    {
        driver.quit();
    }

}
