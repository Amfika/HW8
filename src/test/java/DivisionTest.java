import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest {

    @Test(/*enabled = false,*/ timeOut = 3000)//если за указанное время тест не завершился
    //он признаётся упавшим
    public static void divideWithCorrectData() throws InterruptedException{
        int a = 10;
        int b = 5;
        int expected = 1;

        int result = Main.methodWithError(a,b);

        //Assert.assertTrue(result == 1, "This message will display for error");
        Assert.assertEquals(result, expected);
        //1 тест - 1 assert
        //Assert.fail("I just want to fail");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public static void divideByZeroTest(){
        Main.methodWithError(10, 5);
    }
}
