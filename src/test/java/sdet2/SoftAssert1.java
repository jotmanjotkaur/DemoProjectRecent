package sdet2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {

    SoftAssert softassert  = new SoftAssert();



    @Test
    void demoTest()
    {
        softassert.assertTrue(true);


        softassert.assertEquals("Java" , "JAVA");

        softassert.assertEquals("Java" , "Java");

        System.out.println("Successfully passed");

          softassert.assertAll();




    }
}
