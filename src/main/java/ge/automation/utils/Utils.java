package ge.automation.utils;

    public class Utils{
        public static void log(String message) {
            if (ExtentReportManager.getTest() != null) {
                ExtentReportManager.getTest().info(message);
            }
        }
    }
