package sdet2;


import org.testng.Assert;

import org.testng.annotations.Test;

public class AssertionExample {


    //Hard Assertion
    @Test
    void demoTest()
    {
        Assert.assertTrue(true); //passed

        Assert.assertEquals("welcome" , "welcome"); //pass

        Assert.assertEquals("Java" , "JAVA");//fAIL

        Assert.assertEquals("Java" , "Java");//

        System.out.println("Successfully passed");
    }
}



