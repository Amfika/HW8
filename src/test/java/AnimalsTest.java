import animals.Elephant;
import animals.Lion;
import org.testng.annotations.Test;


public class AnimalsTest extends TestBase{


    @Test
    public static void breatheElephant(){
        Elephant elephant = new Elephant();
        elephant.breathe();
    }

    @Test (description = "Проверка состояния слона по частоте его дыхания", groups = "positive")
    public static void howMany(){
        Elephant elephant = new Elephant();
        int actualResult = elephant.breatheHealsMethod(4);
    }
    @Test (description = "Проверка подвижности слона по частоте его шагов", groups = "negative")
    public static void howFaster(){
        Elephant elephant = new Elephant();
        int actualResult = elephant.howFasterFromMinute(0);
    }

    @Test (description = "проверка состояния льва по частоте его дыхания", groups = "positive")
    public static void howManyLionBreathe(){
        Lion lion = new Lion();
        int actualResult = lion.breatheHealsMethod(0);
    }

    @Test (description = "проверка состояния льва по частоте его шагов", groups = {"positive", "negative"})
    public static void howManyLionMove(){
        Lion lion = new Lion();
        int actualResult = lion.howFasterFromMinute(500);
    }
}
