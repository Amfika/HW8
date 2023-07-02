import birds.Dove;
import birds.Eagle;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)

    public class BirdsTest extends TestBase {

        @Test
        public static void breatheDove() throws InterruptedException {
            Dove dove = new Dove();
            dove.breathe();
            Thread.sleep(3000);
            System.out.println("Закончился 1 тест");
            //Assert.fail(); //тест упадёт и все зависимые будут проигнорированы
        }

        @Test(dependsOnMethods = "breatheDove", alwaysRun = true, description = "Проверка состояния голубя по частоте его дыхания", groups = "positive")
        public static void howManyDoveBreathe() throws InterruptedException {
            Dove dove = new Dove();
            int expectedResult = 16;
            int actualResult = dove.breatheHealsMethod(16);
            Thread.sleep(2000);
            System.out.println("Закончился 2 тест");
            Assert.assertEquals(actualResult, expectedResult, "Some message for error");
        }

        @Test(description = "Проверка подвижности голубя по его действиям", groups = "negative")
        public static void howMoveDove() throws InterruptedException {
            Dove dove = new Dove();
            int expectedResult = 16;
            int actualResult = dove.howFasterFromMinute(1);
            Thread.sleep(8000);
            System.out.println("Закончился 3 тест");
            Assert.assertNotSame(actualResult, expectedResult);
        }

        @Test(description = "проверка состояния орла по частоте его дыхания", groups = "positive")
        public static void howManyEagleBreathe() throws InterruptedException {
            Eagle eagle = new Eagle();
            int expectedResult = 16;
            int actualResult = eagle.breatheHealsMethod(0);
            Thread.sleep(5000);
            System.out.println("Закончился 4 тест");
            Assert.assertNotSame(actualResult, expectedResult);
            Assert.fail("I am a simple fail");
        }

        @Test(description = "проверка состояния орла по его действиям", groups = "negative")
        public static void howEagleMove() throws InterruptedException {
            Eagle eagle = new Eagle();
            int actualResult = eagle.howFasterFromMinute(3);
            Thread.sleep(4000);
            System.out.println("Закончился 5 тест");
            Assert.assertTrue(actualResult == 3);
        }
    }

