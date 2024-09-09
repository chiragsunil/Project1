package day43;

 /*
 1)Login ---@BeforeMethod
 2)Search-- @Test
 3)Logout---@AfterMethod
 4)Login
 5)Advance Search ---*Test
 6)Logut
  */

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 {

    @BeforeMethod
    void login(){
        System.out.println("This is login");
    }

    @AfterMethod
    void logout(){
        System.out.println("This is for logout");
    }

    @Test(priority = 1)
    void search(){
        System.out.println("This is for search");
    }

    @Test(priority = 2)
    void advanceSearch(){
        System.out.println("This is for advance search");
    }




}
