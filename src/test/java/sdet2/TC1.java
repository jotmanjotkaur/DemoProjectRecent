package sdet2;

import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before the class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after the class");
    }


    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will Execute  before every test Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will Execute  after every test Method");
    }

    @Test
    void test1()
    {
        System.out.println("This is test1....");
    }

    @Test
    void test2(){
        System.out.println("This is test2....");
    }

    @BeforeSuite
    void beforesuite(){
        System.out.println("This method will execute before the test suite");
    }
    @AfterSuite
    void aftersuite(){
        System.out.println("This method will execute before the test suite");
    }

}
