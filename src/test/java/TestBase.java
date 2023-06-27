import org.testng.annotations.*;

public class TestBase {
    @BeforeTest
    public static void setup(){
        System.out.println("Before test");
    }

    @AfterTest
    public static void teardown(){
        System.out.println("After test");
    }

    @BeforeGroups("smoke")
    public static void smokeSetup(){
        System.out.println("Before groups 'smoke'");
    }

    @AfterGroups("smoke")
    public static void smokeTeardown(){
        System.out.println("After groups 'smoke'");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public static void methodSetup(){
        System.out.println("Before method");
    }

    @AfterMethod
    public static void methodTeardown(){
        System.out.println("After method");
    }

}
