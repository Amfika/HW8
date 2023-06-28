import birds.Dove;
import birds.Eagle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BirdsTest extends TestBase{

    @Test
    public static void breatheDove(){
        Dove dove = new Dove();
        dove.breathe();
    }

    @Test (description = "Проверка состояния голубя по частоте его дыхания", groups = "positive")
    public static void howManyDoveBreathe(){
        Dove dove = new Dove();
        int expectedResult = 16;
        int actualResult = dove.breatheHealsMethod(16);

        Assert.assertEquals(actualResult, expectedResult, "Some message for error");
    }
    @Test (description = "Проверка подвижности голубя по его действиям", groups = "negative")
    public static void howMoveDove(){
        Dove dove = new Dove();
        int expectedResult = 16;
        int actualResult = dove.howFasterFromMinute(1);

        Assert.assertNotSame(actualResult, expectedResult);
    }

    @Test (description = "проверка состояния орла по частоте его дыхания", groups = "positive")
    public static void howManyEagleBreathe(){
        Eagle eagle = new Eagle();
        int expectedResult = 16;
        int actualResult = eagle.breatheHealsMethod(0);

        Assert.assertNotSame(actualResult, expectedResult);
        Assert.fail("I am a simple fail");
    }

    @Test (description = "проверка состояния орла по его действиям", groups = "negative")
    public static void howEagleMove(){
        Eagle eagle = new Eagle();
        int actualResult = eagle.howFasterFromMinute(3);

        Assert.assertTrue(actualResult == 3);
    }
}
