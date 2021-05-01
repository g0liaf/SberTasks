package com.sberhomework.part2.zoo.animal;

public class Monkey extends Animal {
    public Monkey() {
        this.name = "Monkey";
    }

    public Monkey(String name) {
        super(name);
    }

    public Monkey(int age) {
        super(age);
    }

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println(this.name + ": AUaUAUA aAUA");
    }

    @Override
    public boolean isOld() {
        return age > 20;
    }
}
