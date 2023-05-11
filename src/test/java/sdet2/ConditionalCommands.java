package sdet2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConditionalCommands {
    public static void main(String[] args) { ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();



        //check username or password present or not
        //if display - enable or not

    /*    driver.get("https://www.facebook.com/");

    WebElement email = driver.findElement(By.xpath("//input[@id='email']")); //idetify the element
        //id display - return true or false
//enabled means - can enter some value

        WebElement password = driver.findElement(By.xpath(" //input[@id='pass']"));

        if(email.isDisplayed() && email.isEnabled())
        {
            email.sendKeys("manjot@gmail.com");

        }

        if(password.isDisplayed() && password.isEnabled())
        {
            password.sendKeys("manjot");

        }

     */
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569885%7Cb%7Cfb%20sign%20up%7C&placement=&creative=589460569885&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9302075%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI543Iz9yj_gIVfNdMAh0FEAbKEAAYASAAEgJ7BPD_BwE");
//false
        System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Female')]")).isSelected());

        System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Male')]")).isSelected());
        //false

//select female radio button

        if(driver.findElement(By.xpath("//label[contains(text(),'Female')]")).isSelected()==false)
        {
            driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        }





    }
}
