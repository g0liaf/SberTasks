package com.sberhomework.part2.zoo.aviary;

import com.sberhomework.part2.zoo.animal.Animal;
import com.sberhomework.part2.zoo.exception.AviaryException;

import java.util.ArrayList;

public abstract class Aviary {
    protected int maxSize;
    protected ArrayList<Animal> animals = new ArrayList<>();

    public Aviary(int maxSize) {
        this.maxSize = maxSize;
    }

    public void addAnimal(Animal animal) throws AviaryException {
        if (animals.contains(animal)) {
            throw new AviaryException("Animal " + animal.getName() + " is already in aviary");
        }
        if (animals.size() == maxSize) {
            throw new AviaryException("No free space in aviary");
        }
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) throws AviaryException {
        if (!animals.contains(animal)) {
            throw new AviaryException("Animal " + animal.getName() + " is already missing in aviary");
        }
        animals.remove(animal);
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return animals.size();
    }

}
