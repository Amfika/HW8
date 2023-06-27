import birds.Dove;
import birds.Eagle;

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
        int actualResult = dove.breatheHealsMethod(16);
    }
    @Test (description = "Проверка подвижности голубя по его действиям", groups = "negative")
    public static void howMoveDove(){
        Dove dove = new Dove();
        int actualResult = dove.howFasterFromMinute(1);
    }

    @Test (description = "проверка состояния орла по частоте его дыхания", groups = "positive")
    public static void howManyEagleBreathe(){
        Eagle eagle = new Eagle();
        int actualResult = eagle.breatheHealsMethod(0);
    }

    @Test (description = "проверка состояния орла по его действиям", groups = "negative")
    public static void howEagleMove(){
        Eagle eagle = new Eagle();
        int actualResult = eagle.howFasterFromMinute(3);
    }
}
