package sdet2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion1 {
// we are using the same object : thats why 2nd test method also failed
 //create different objects for two different methods
    SoftAssert softAssert= new SoftAssert();

    @Test
    void demoTest1()
    {
        softAssert.assertEquals("welcome" , "wel"); //false - failed
        softAssert.assertAll();
     }

    @Test
    void demoTest2()
    {
        softAssert.assertEquals("welcome" , "welcome"); //true - passed
        softAssert.assertAll();
    }


}
