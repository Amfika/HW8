package org.example;
import animals.Elephant;
import animals.Lion;
import birds.Dove;
import birds.Eagle;
import fishes.GoldFish;
import fishes.Shark;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Dove dove = new Dove();
        Eagle eagle = new Eagle();
        Shark shark = new Shark();
        GoldFish goldFish = new GoldFish();

        System.out.print("Выберите животное из списка: \n1 - Лев\n2 - Слон\n3 - Голубь\n" +
                "4 - Орёл\n5 - Акула\n6 - Золотая рыбка\nСделайте свой выбор: ");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        if (choise == 1){
            System.out.println("Лев");
            lion.breathe();
            lion.move();
            lion.growl();
        } else if (choise == 2) {
            System.out.println("Слон");
            elephant.breathe();
            elephant.move();
            elephant.splashWater();
        } else if (choise == 3) {
            System.out.println("Голубь");
            dove.breathe();
            dove.move();
            dove.voice();
        } else if (choise == 4) {
            System.out.println("Орёл");
            eagle.breathe();
            eagle.move();
            eagle.eat();
        } else if (choise == 5) {
            System.out.println("Акула");
            shark.breathe();
            shark.move();
            shark.bodyShark();
        } else if (choise == 6) {
            System.out.println("Золотая рыбка");
            goldFish.breathe();
            goldFish.move();
            goldFish.eatFish();
        }

    }

    public static int methodWithError(int a, int b){
        return a/b;
    }
}