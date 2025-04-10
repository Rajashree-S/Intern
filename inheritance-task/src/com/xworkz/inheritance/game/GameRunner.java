package com.xworkz.inheritance.game;

public class GameRunner {
    public static void main(String[] args) {
        Game base = new Game();
        base.name = "Game Example";
        base.type = "General";
        base.display();
        base.get();

        Cricket sub = new Cricket();
        sub.name = "Cricket Example";
        sub.type = "Specific";
        sub.display();
        sub.get();
    }
}
