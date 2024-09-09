package day44;

import org.testng.annotations.Test;

public class SignUpTest {

    @Test(priority = 1,groups = {"regression"})
    void signUpByEmail(){
        System.out.println("This is signUpByEmail");
    }

    @Test(priority = 2,groups = {"regression"})
    void signUpByFaceBook(){
        System.out.println("This is signUpByFaceBook");
    }

    @Test(priority = 3,groups = {"regression"})
    void signUpByTwitter(){
        System.out.println("This is signUpByTwitter");
    }
}
