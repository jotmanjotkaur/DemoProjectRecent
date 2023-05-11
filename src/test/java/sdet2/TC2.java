package sdet2;

import org.testng.annotations.*;

public class TC2 {

@BeforeTest
void beforetest(){
    System.out.println("This will execute before the test");
}

@AfterTest
void aftertest()
{
    System.out.println("This will execute after the test");
}


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
    void test3()
    {
        System.out.println("This is test3");
    }
    @Test
    void test4()
    {
        System.out.println("This is test4");
    }

}
