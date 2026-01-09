package ch.samt.clashroyale.app;

import ch.samt.clashroyale.battle.BattleEngine;
import ch.samt.clashroyale.model.*;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TroopCard knight = new TroopCard("Knight", 3, 11, 1400, 150);
        TroopCard archer = new TroopCard("Archer", 3, 11, 800, 90);
        SpellCard fireball = new SpellCard("Fireball", 4, 11, 325, 2.5);
        Deck deck = new Deck();
        deck.addCard(knight);
        deck.addCard(archer);
        deck.addCard(fireball);

        Player player = new Player("PlayerOne", deck);

        BattleEngine engine = new BattleEngine();

//        System.out.println("\n--- Playing cards ---");
//        for (Card card : player.getDeck().getCards()) {
//            engine.playCard(card);
//        }

//        ArrayList<Card> cards = player.getDeck().getCards();
//        for (Card card : cards) {
//            System.out.println(card);
//        }
    }
}