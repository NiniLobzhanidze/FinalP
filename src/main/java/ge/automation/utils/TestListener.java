package ge.automation.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
Utils utils;

    @Override
    public void onTestStart(ITestResult result){
        String testName = result.getMethod().getMethodName();
        ExtentReportManager.createTest(testName);

        System.out.println("Test Started: " + result.getClass());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        ExtentReportManager.getTest().pass("Test Passed");
        System.out.println("Test Success: " + result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failure: " + result.getName());
        ExtentReportManager.getTest().fail("Test Failed: " + result.getThrowable());
    }
    @Override
    public void onTestSkipped(ITestResult result){
        ExtentReportManager.getTest().skip("Test Skipped: " + result.getThrowable());
        System.out.println("Test Skipped: " + result.getName());
    }
    @Override
    public void onStart(ITestContext context){
        System.out.println("Test Suit Started: " + context.getName());
    }
    @Override
    public void onFinish(ITestContext context){
        System.out.println("Test Suit Finished: " + context.getName());
        ExtentReportManager.flushReports();
    }
}
