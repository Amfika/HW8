import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){
        String testName = result.getMethod().getMethodName();
        System.out.println("Возникли проблемы с тестовым методом: " + testName + ". Скриншот снят!");
    }
}
