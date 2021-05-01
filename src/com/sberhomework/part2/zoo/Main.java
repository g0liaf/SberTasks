package com.sberhomework.part2.zoo;

import com.sberhomework.part2.zoo.animal.Cat;
import com.sberhomework.part2.zoo.animal.Monkey;
import com.sberhomework.part2.zoo.aviary.Aviary;
import com.sberhomework.part2.zoo.aviary.CatAviary;
import com.sberhomework.part2.zoo.aviary.MonkeyAviary;
import com.sberhomework.part2.zoo.exception.AnimalSleepException;
import com.sberhomework.part2.zoo.exception.AviaryException;

public class Main {
    public static void main(String[] args) {
        var leopold = new Cat("Leopold", 11);
        var gav = new Cat("Gav");
        gav.setAge(2);
        var streetCat = new Cat();
        gav.sleep();
        streetCat.talk();
        streetCat.play(leopold);
        leopold.move();
        System.out.println(leopold.isOld());
        System.out.println(streetCat.isYoung());

        var king = new Monkey("King", 1500);
        king.talk();
        king.move();
        king.play(king);

        try {
            leopold.sleep(55);
        } catch (AnimalSleepException e) {
            System.out.println(e.getMessage());
        }

        try {
            king.sleep(5);
        } catch (AnimalSleepException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(king.isOld());
        System.out.println(king.isYoung());

        var catAviary = new CatAviary(3);
        var monkeyAviary = new MonkeyAviary(2);

        try {
            catAviary.addAnimal(king);
        } catch (AviaryException e) {
            System.out.println(e.getMessage());
        }

        try {
            catAviary.addAnimal(leopold);
            catAviary.addAnimal(leopold);
        } catch (AviaryException e) {
            System.out.println(e.getMessage());
        }

        try {
            catAviary.removeAnimal(leopold);
            catAviary.removeAnimal(leopold);
        } catch (AviaryException e) {
            System.out.println(e.getMessage());
        }

    }
}
