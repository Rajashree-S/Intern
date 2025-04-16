package com.xworkz.inheritance.animal;

import com.xworkz.inheritance.animal.animalfunction.Animal;
import com.xworkz.inheritance.animal.lion.Lion;

public class AnimalRunner {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.animalDiet();
        animal.animalHabitat();
        animal.animalName();
        animal.animalSound();
        animal.animalType();

        Animal animal1 = new Lion();
        animal1.animalDiet();
        animal1.animalHabitat();
        animal1.animalName();
        animal1.animalSound();
        animal1.animalType();

        Lion lion = new Lion();
        lion.lionAge();
        lion.lionName();
        lion.lionGender();
        lion.lionHabitat();
        lion.lionRoar();




    }
}
