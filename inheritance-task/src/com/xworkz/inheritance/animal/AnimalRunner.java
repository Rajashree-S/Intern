package com.xworkz.inheritance.animal;

import com.xworkz.inheritance.animal.animalfunction.Animal;
import com.xworkz.inheritance.animal.lion.Lion;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.getAnimal();

        Lion lion = new Lion();
        lion.getAnimal();
    }
}
