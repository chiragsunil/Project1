package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {

    @Test
    void test(){
        //Assert.assertEquals("xyz","xyz");
       // Assert.assertEquals(123,456);
       // Assert.assertEquals("abc",123);
        //Assert.assertEquals("123",123);
        //Assert.assertNotEquals(123,123);//failed
        //Assert.assertNotEquals(123,234 );
        //Assert.assertTrue(true); //pass
        //Assert.assertTrue(false); //failed

        //Assert.assertTrue(1==2);//failed
        //Assert.assertTrue(1==1);//Passed

        //Assert.assertFalse(1==2); //Passed
        Assert.assertFalse(1==1); //failed
    }
}
