package day44;

import org.testng.annotations.Test;

public class LoginTest {

    @Test(priority = 1,groups = {"sanity"})
    void loginByEmail(){
        System.out.println("This is login ByEmail");
    }

    @Test(priority = 2,groups = {"sanity"})
    void loginByFaceBook(){
        System.out.println("This is loginby FaceBook");
    }

    @Test(priority = 3,groups = {"sanity"})
    void loginByTwitter(){
        System.out.println("This is login By Twitter");
    }
}
