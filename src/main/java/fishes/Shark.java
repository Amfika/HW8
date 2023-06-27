package fishes;

import fishes.Fishes;

public class Shark extends Fishes {

    @Override
    public void breathe(){
        System.out.println("Дыхание акулы");
    }

    @Override
    public void move() {
        System.out.println("Акула никогда не останавливается");
    }

    public void bodyShark(){
        System.out.println("Распознать акулу можно по плавнику, торчащему на поверхности воды");
    }
}

