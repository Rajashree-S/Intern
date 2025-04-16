package com.xworkz.inheritance.game;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.gameName();
        game.gameGenre();
        game.gameDeveloper();
        game.gamePlatform();
        game.gameReleaseYear();

        Game game1 = new Pubg();
        game1.gameName();
        game1.gameGenre();
        game1.gameDeveloper();
        game1.gamePlatform();
        game1.gameReleaseYear();

        Pubg pubg = new Pubg();
        pubg.pubgMode();
        pubg.pubgMap();
        pubg.pubgWeapons();
        pubg.pubgPlayersLimit();
        pubg.pubgRankingSystem();


    }
}
