package day44;

import org.testng.annotations.Test;

public class PaymentTest {

    @Test(priority = 1,groups = {"sanity","regression"})
    void paymentByRupees(){
        System.out.println("payment in rupees....");
    }

    @Test(priority = 2,groups = {"sanity","regression"})
    void paymentByDollars(){
        System.out.println("payment in dollars");
    }
}
