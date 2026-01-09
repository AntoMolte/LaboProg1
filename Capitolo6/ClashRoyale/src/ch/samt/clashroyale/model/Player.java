package ch.samt.clashroyale.model;

public class Player {
    private String nickname;
    private Deck deck;

    public Deck getDeck() {
        return deck;
    }

    public Player(String nickname, Deck deck) {
        this.nickname = nickname;
        this.deck = deck;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", deck=" + deck +
                '}';
    }
}
