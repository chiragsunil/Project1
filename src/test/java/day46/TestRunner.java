package day46;

import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestRunner {

    @BeforeClass
    public void setup() {
        System.out.println("Setup before test execution.");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Teardown after test execution.");
    }

    public static void main(String[] args) {
        TestNG testNG = new TestNG();

        // Specify the classes to be executed
        testNG.setTestClasses(new Class[] { YourTestClass.class });

        // Add the listener
        testNG.addListener(new ExtentReportManager());

        // Run the tests
        testNG.run();
    }
    }


