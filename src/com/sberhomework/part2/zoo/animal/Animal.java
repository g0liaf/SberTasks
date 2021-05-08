package com.sberhomework.part2.zoo.animal;

import com.sberhomework.part2.zoo.animal.interfaces.Moveable;
import com.sberhomework.part2.zoo.animal.interfaces.Talkable;
import com.sberhomework.part2.zoo.exception.AnimalSleepException;

public abstract class Animal implements Moveable, Talkable {
    protected String name = "No name";
    protected int age = 0;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    public void sleep(int hours) throws AnimalSleepException {
        if (hours > 24) {
            throw new AnimalSleepException("Can't sleep more than 24 hours");
        }
        System.out.println(this.name + " is sleeping for " + hours + " hours");
    }

    public void play(Animal animal) {
        System.out.println(this.name + " is playing with " + animal.getName());
    }

    @Override
    public void move() {
        System.out.println(this.name + " is moving");
    }

    @Override
    public void talk() {
        System.out.println(this.name + " is talking");
    }

    public boolean isYoung() {
        return !isOld();
    }

    public abstract  boolean isOld();
}
