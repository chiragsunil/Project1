package day42;

import org.testng.annotations.Test;

/*
1)Open app
2)Login
3)LogOut

*/
public class FirstTestCaseTestNg {

    @Test(priority = 1)
     void openApp(){

        System.out.println("Open the application......");
     }

     @Test(priority = 2)
     void  loginApp(){

        System.out.println("Login the application");
     }

     @Test(priority = 3)
     void logout(){

        System.out.println("Logout the application");
     }


}
