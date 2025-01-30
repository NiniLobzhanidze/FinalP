package ge.automation.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestListener result){
        System.out.println("Test Started: " + result.getClass());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Test Success: " + result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failure: " + result.getName());
    }
    @Override
    public void onTestSkip(ITestResult result){
        System.out.println("Test Skipped: " + result.getName());
    }
    @Override
    public void onStart(ITestContext context){
        System.out.println("Test Suit Started: " + context.getName());
    }
    @Override
    public void onFinish(ITestContext context){
        System.out.println("Test Suit Finished: " + context.getName());
    }
}
