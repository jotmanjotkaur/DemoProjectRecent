package sdet2;


import org.testng.annotations.Test;

public class PriorityExample
{
    @Test(priority = 0)
    void testOne()
    {
        System.out.println("This is test 1");
    }


    @Test
    void testTwo()
    {

        System.out.println("This is test 2");
    }

    @Test(priority=2 , enabled = false)
    void testThree()
    {


        System.out.println("This is test 3");
    }

    @Test (priority = 1)
    void testFour()
    {
        System.out.println("This is test 4");
    }



}
