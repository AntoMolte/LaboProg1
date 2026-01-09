package ch.samt.clashroyale.model;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public ArrayList<Card> getCards() {
        for (Card card : cards) {
            System.out.println(card);
        }
        return null;
    }

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
