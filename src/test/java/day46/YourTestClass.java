package day46;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(day46.ExtentReportManager.class) // Specify the listener class here

    public class YourTestClass {

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1 Executed");
        int expected = 10;
        int actual = 5 + 5;
        Assert.assertEquals(actual, expected, "The addition result is not as expected.");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2 Executed");
        boolean isTrue = true;
        Assert.assertTrue(isTrue, "The condition is not true.");
    }
    }



