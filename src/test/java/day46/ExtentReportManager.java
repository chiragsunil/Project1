package day46;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter; // UI of the report
    public ExtentReports extentReports; // Populate common info on the report
    public ExtentTest test; // Create test case entries in the report and update the status of the test method

    public void onStart(ITestContext context) {
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html"); // Specified the location
        sparkReporter.config().setDocumentTitle("Automation report"); // Title of the report
        sparkReporter.config().setReportName("Functional testing"); // Name of the report
        sparkReporter.config().setTheme(Theme.DARK); // Theme of the report

        extentReports = new ExtentReports(); // Create an Object
        extentReports.attachReporter(sparkReporter); // Attach reports

        extentReports.setSystemInfo("Computer Name", "localhost");
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("Tester Name", "pavan");
        extentReports.setSystemInfo("OS", "Windows10");
        extentReports.setSystemInfo("Browser Name", "Chrome");
    }

    @Override
    public void onTestSuccess(ITestResult result) { // Corrected method name
        test = extentReports.createTest(result.getName()); // Create a new entity in the report
        test.log(Status.PASS, "Test case Passed is: " + result.getName()); // Update status
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test = extentReports.createTest(result.getName());
        test.log(Status.FAIL, "Test case Failed is: " + result.getName());
        test.log(Status.FAIL, "Test case cause Failed is: " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test = extentReports.createTest(result.getName());
        test.log(Status.SKIP, "Test case is SKIPPED is: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }
}
