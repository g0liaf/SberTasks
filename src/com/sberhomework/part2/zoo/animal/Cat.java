package com.sberhomework.part2.zoo.animal;

public class Cat extends Animal {
    public Cat() {
        this.name = "Street cat";
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(int age) {
        super(age);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println(this.name + " is nicely walking");
    }

    @Override
    public void talk() {
        System.out.println(this.name + ": Meow");
    }

    @Override
    public boolean isOld() {
        return age > 10;
    }
}
