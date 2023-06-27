package birds;

import birds.Birds;

public class Eagle extends Birds {

    @Override
    public void breathe(){
        System.out.println("Дыхание орла");
    }

    @Override
    public void move() {
        System.out.println("Орёр взмахивает крылом");
    }

    @Override
    public int breatheHealsMethod(int birdsBreathe) {
        if ((birdsBreathe >= 15) && (birdsBreathe <= 32) ) {
            System.out.println("Дыхание Орла в пределах нормы");
        } else if((birdsBreathe > 0) && (birdsBreathe < 15)) {
            System.out.println("Дыхание Орла не в норме");
        }else if (birdsBreathe == 0) {
            System.out.println("Орла больше нет...(");
        } else if (birdsBreathe < 0) {
            System.out.println("Введено не верное значение!");
        } else {
            System.out.println("Орёл затаился");
        }
        return birdsBreathe;
    }

    @Override
    public int howFasterFromMinute(int birdsSpeed) {
        if ((birdsSpeed >= 100)&& (birdsSpeed <= 300)){
            System.out.println("Орёл пархает над жертвой");
        } else if (birdsSpeed == 0 ) {
            System.out.println("Орёл высматривает добычу");
        } else if (birdsSpeed < 0) {
            System.out.println("Орёл притворился спящим");
        } else {
            System.out.println("Выбрано не верное значение");
        }
        return birdsSpeed;
    }

    public void eat(){
        System.out.println("Орёл предпочитает охотиться на грызунов");
    }
}

