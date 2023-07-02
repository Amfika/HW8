import animals.Elephant;
import animals.Lion;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


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

        Assert.assertTrue(actualResult == 4);
    }
    @Test (description = "Проверка подвижности слона по частоте его шагов", groups = "negative")
    public static void howFaster(){
        Elephant elephant = new Elephant();
        int actualResult = elephant.howFasterFromMinute(10);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualResult == 4 , "Don't worry. This is a special negative case. Relax ");
        softAssert.fail("Second error for assert");
        softAssert.assertAll();//решит судьбу теста
    }

    @Test (description = "проверка состояния льва по частоте его дыхания", groups = "positive")
    public static void howManyLionBreathe(){
        Lion lion = new Lion();
        int actualResult = lion.breatheHealsMethod(0);

        Assert.assertFalse(actualResult == 1);
    }

    @Test (description = "проверка состояния льва по частоте его шагов", groups = {"positive", "negative"})
    public static void howManyLionMove(){
        Lion lion = new Lion();
        int actualResult = lion.howFasterFromMinute(500);

        Assert.assertFalse(actualResult == 500);
    }

    @Test
    @Parameters(value = "xml-param") // несколько параметров передавать не получится
    public static void xmlParamTest(String param){
        System.out.println("This test run with parameter: " + param);
    }

    @Test(dataProvider = "elephantLegs")
    public static void incorrectLegs(int firstSide, int secondSide){
        System.out.println("С одной стороны сколько ног? " + firstSide + ", а с другой стороны? " + secondSide);
    }


    @DataProvider(name = "elephantLegs")//сколько ног у слона // метод-провайдер
    public Object [][] incorrectLegs() {
        return new Object[][]{
                { 1 , 2 },
                { 2 , 1 },
                { 1 , 1 },
        };
    }
}
