package day43;

import org.testng.annotations.*;

public class AnnotationDemo2 {


    @BeforeClass
    void login(){
        System.out.println("This is login");
    }

    @AfterClass
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
