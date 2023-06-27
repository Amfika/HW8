import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public static void logWithCorrCreds(){
        System.out.println("login1");
    }

    @Test
    public static void logWithIncorrCreds(){
        System.out.println("login2");
    }
}
