package sdet2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;


public class DataDrivenTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();


    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String user,String pwd, String exp)
    {

     // System.out.println(user +pwd + exp);

        driver.get("http://admin-demos.nop-templates.com/login?ReturnUrl=%2Fadmin%2FStoreLocatorAdmin%2FList");

        WebElement txtemail =driver.findElement(By.id("Email"));
        txtemail.clear();
        txtemail.sendKeys(user);

        WebElement txtpwd =driver.findElement(By.id("Password"));
        txtpwd.clear();
        txtpwd.sendKeys(pwd);

        driver.findElement(By.xpath(" //button[contains(text(),'Log in')]")).click();  //login Button


        String exp_title = "http://admin-demos.nop-templates.com/admin/StoreLocatorAdmin/List" ;
        String act_title=driver.getTitle();

/*
        if(exp.equals("valid"))
        {

            if(exp_title.equals(act_title))
            {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(true);
            }

            else
            {
                Assert.assertTrue(false);
            }
        }
        else if (exp.equals("invalid"))
        {

            if(exp_title.equals(act_title))
            {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(false);
            }

            else
            {
                Assert.assertTrue(true);
            }

        }

 */

    }




@DataProvider (name="LoginData")
    public Object[][] getData() throws IOException   //Data Provider Method
    {

String loginData[][]=
        {
                {"admin@yourstore.com","admin","Valid"},
                {"admin@yourstore.com","adm","Invalid"},
                {"adm@yourstore.com","admin","Invalid"},
                {"adm@yourstore.com","adm","Invalid"}
        };






/*
//get the data from excel
        String path="F://Demo1//Book1.xlsx";
        ExcelUtility xlutil=new ExcelUtility(path);

        int totalrows=xlutil.getRowCount("Sheet1");
        int totalcols=xlutil.getCellCount("Sheet1",1);

        String loginData[][]=new String[totalrows][totalcols];


        for(int i=1;i<=totalrows;i++) //1
        {
            for(int j=0;j<totalcols;j++) //0
            {
                loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
            }

        }

 */



        return loginData;
    }
@AfterClass
 void teardown()
 {
     driver.close();
 }
    }






