package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {

    @Test
    void  test_hasrdassrtion(){
        System.out.println("testing");
        System.out.println("testing");

        Assert.assertEquals(1,2); //hard assertion
        System.out.println("testing");
        System.out.println("testing");
    }

    @Test
    void  test_softassrtion() {
        System.out.println("testing");
        System.out.println("testing");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(1, 2); //soft assertion

        System.out.println("testing");
        System.out.println("testing");

        softAssert.assertAll(); //mandatory
    }


}
