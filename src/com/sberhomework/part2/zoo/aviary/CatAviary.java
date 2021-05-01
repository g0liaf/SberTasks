package com.sberhomework.part2.zoo.aviary;

import com.sberhomework.part2.zoo.animal.Animal;
import com.sberhomework.part2.zoo.animal.Cat;
import com.sberhomework.part2.zoo.exception.AviaryException;

public class CatAviary extends Aviary{
    public CatAviary(int maxSize) {
        super(maxSize);
    }

    @Override
    public void addAnimal(Animal animal) throws AviaryException {
        if (!(animal instanceof Cat)) {
            throw new AviaryException("Defiantly not cat!");
        }
        super.addAnimal(animal);
    }

    @Override
    public void removeAnimal(Animal animal) throws AviaryException {
        if (!(animal instanceof Cat)) {
            throw new AviaryException("Defiantly not cat!");
        }
        super.removeAnimal(animal);
    }
}
