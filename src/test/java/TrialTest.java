import org.testng.annotations.*;

public class TrialTest extends TestBase{

    @Test(groups = "smoke", enabled = false)
    public static void firstTest(){
        System.out.println("First");
    }

    @Test(groups = {"smoke", "regression"})
    public static void secondTest(){
        System.out.println("Second");
    }

    @Test(groups = "regression")
    public static void thirdTest(){
        System.out.println("Third");
    }
}
