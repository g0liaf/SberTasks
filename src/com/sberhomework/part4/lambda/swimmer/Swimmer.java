package com.sberhomework.part4.lambda.swimmer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Swimmer {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Swimmer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void swim(Consumer<String> c) {
        c.accept(name);
    }

}
