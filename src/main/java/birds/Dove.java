package birds;

public class Dove extends Birds {

    @Override
    public void breathe(){
        System.out.println("Дыхание голубя в минуту составляет от 15 до 32 вдохов и выдохов");
    }

    @Override
    public void move() {
        System.out.println("Голубь летит");
    }

    @Override
    public int breatheHealsMethod(int birdsBreathe) {
        if ((birdsBreathe >= 15) && (birdsBreathe <= 32) ) {
            System.out.println("Дыхание голубя в пределах нормы");
        } else if((birdsBreathe > 0) && (birdsBreathe < 15)) {
            System.out.println("Дыхание голубя не в норме");
        }else if (birdsBreathe == 0) {
            System.out.println("Голубя больше нет...(");
        } else if (birdsBreathe < 0) {
            System.out.println("Введено не верное значение!");
        } else {
            System.out.println("Голубь напуган");
        }
        return birdsBreathe;
    }

    @Override
    public int howFasterFromMinute(int birdsSpeed) {
            if ((birdsSpeed >= 100)&& (birdsSpeed <= 300)){
                System.out.println("Голубь активно машет крыльями в воздухе");
            } else if (birdsSpeed == 0 ) {
                System.out.println("Голубь просто стоит");
            } else if (birdsSpeed < 0) {
                System.out.println("Голубь спит");
            } else {
                System.out.println("Выбрано не верное значение");
            }
            return birdsSpeed;
    }

    public void voice(){
        System.out.println("Голубь курлычет");
    }
}

