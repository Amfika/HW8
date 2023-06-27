package animals;

public class Lion extends Animals {

    @Override
    public void breathe(){
        System.out.println("Лев дышит");
    }

    @Override
    public void move() {
        System.out.println("Лев медленно двигается");
    }

    @Override
    public int breatheHealsMethod(int animalsBreathe) {
        if ((animalsBreathe >= 20) && (animalsBreathe <= 35) ) {
            System.out.println("Лев здоров, не трогайте животное!");
        } else if (animalsBreathe == 0) {
            System.out.println("Лев не дышит!");
        } else if (animalsBreathe < 0) {
            System.out.println("Введено не верное значение!");
        } else {
            System.out.println("Льва следует показать врачу");
        }
        return animalsBreathe;
    }

    @Override
    public int howFasterFromMinute(int animalSpeed) {
        if ((animalSpeed >= 25) && (animalSpeed <= 60)) {
            System.out.println("Лев прогуливается");
        } else if ((animalSpeed > 60) && (animalSpeed <= 100)) {
            System.out.println("Лев прибавил скорости!");
        } else if ((animalSpeed < 25) && (animalSpeed > 0)) {
            System.out.println("Лев на охоте и подкрадывается к добыче");
        }else if (animalSpeed == 0) {
            System.out.println("Лев высматривает добычу");
        } else if (animalSpeed < 0) {
            System.out.println("Введено не верное значение");
        } else {
            System.out.println("Лев гонится за добычей");
        }
        return animalSpeed;
    }

    public void growl(){
        System.out.println("Лев рычит");
    }
}

