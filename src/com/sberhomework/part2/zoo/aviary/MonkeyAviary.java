package com.sberhomework.part2.zoo.aviary;

import com.sberhomework.part2.zoo.animal.Animal;
import com.sberhomework.part2.zoo.animal.Monkey;
import com.sberhomework.part2.zoo.exception.AviaryException;

public class MonkeyAviary extends Aviary {

    public MonkeyAviary(int maxSize) {
        super(maxSize);
    }

    @Override
    public void addAnimal(Animal animal) throws AviaryException {
        if (!(animal instanceof Monkey)) {
            throw new AviaryException("Defiantly not monkey!");
        }
        super.addAnimal(animal);
    }

    @Override
    public void removeAnimal(Animal animal) throws AviaryException {
        if (!(animal instanceof Monkey)) {
            throw new AviaryException("Defiantly not monkey!");
        }
        super.removeAnimal(animal);
    }
}
