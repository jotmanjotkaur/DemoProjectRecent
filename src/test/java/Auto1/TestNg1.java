package Auto1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.xml.bind.SchemaOutputResolver;

public class TestNg1 {
    @BeforeClass
    void beforeClass1(){



        System.out.println("This will execute before the Class");
    }


    @AfterClass
    void afterClass1()
    {
        System.out.println("This will execute After the Class");
    }

    @Test
    void test1(){
        System.out.println("This is Test1");
    }
 @Test
 @Parameters({"username"})
    void test2(){


        System.out.println("This is Test2");
    }


}
