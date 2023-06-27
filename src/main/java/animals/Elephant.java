package animals;

public class Elephant extends Animals {

    @Override
    public void breathe() {
        int howManybreatheInMinute = 6;
        System.out.println("Слон дышит в минуту раз: "+ howManybreatheInMinute);
    }

    @Override
    public void move() {
        System.out.println("Слон медленно передвигается");
    }

    @Override
    public int breatheHealsMethod(int animalsBreathe) {
        if ((animalsBreathe >= 4) && (animalsBreathe <= 6) ) {
            System.out.println("Слон здоров как бык!");
        } else if (animalsBreathe == 0) {
            System.out.println("Слон не дышит!");
        } else if (animalsBreathe < 0) {
            System.out.println("Введено не верное значение!");
        } else {
            System.out.println("Слона следует показать врачу");
        }
        return animalsBreathe;
    }

    @Override
    public int howFasterFromMinute(int animalSpeed) {
        if ((animalSpeed >= 15) && (animalSpeed <= 20)) {
            System.out.println("Слон прогуливается");
        } else if ((animalSpeed > 20) && (animalSpeed <= 30)) {
            System.out.println("Слон прибавил скорости!");
        } else if (animalSpeed == 0) {
            System.out.println("Слон стоит на месте и кушает");
        } else if (animalSpeed < 0) {
            System.out.println("Введено не верное значение");
        } else {
            System.out.println("Слон дал дёру! =)");
        }
        return animalSpeed;
    }

    public void splashWater(){
        System.out.println("Слон набирает воду в хобот и обливается");
    }

}



