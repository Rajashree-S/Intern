package com.xworkz.inheritance.bird;

public class BirdRunner {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.birdColor();
        bird.birdHabitat();
        bird.birdName();
        bird.birdSound();
        bird.birdType();


        Bird bird1 = new Parrot();
        bird1.birdColor();
        bird1.birdHabitat();
        bird1.birdName();
        bird1.birdSound();
        bird1.birdType();

        Parrot parrot = new Parrot();
        parrot.parrotAge();
        parrot.parrotColor();
        parrot.parrotName();
        parrot.parrotSound();
        parrot.parrotHabitat();



    }
}
