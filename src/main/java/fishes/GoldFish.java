package fishes;

import fishes.Fishes;

public class GoldFish extends Fishes {

    @Override
    public void breathe(){
        System.out.println("Дыхание зотолой рыбки не видно человеческому глазу");
    }

    @Override
    public void move() {
        System.out.println("Передвигается рыбка плавая в пределах домашнего аквариума");
    }

    public void eatFish(){
        System.out.println("Рыбка любит живой корм");
    }
}

