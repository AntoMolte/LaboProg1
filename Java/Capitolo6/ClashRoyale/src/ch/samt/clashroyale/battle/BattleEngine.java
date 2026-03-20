package ch.samt.clashroyale.battle;

import ch.samt.clashroyale.model.Card;
import ch.samt.clashroyale.model.SpellCard;
import ch.samt.clashroyale.model.TroopCard;

public class BattleEngine {
    public void playCard(Card card){
        if(card instanceof TroopCard){
            TroopCard cardaDanno = (TroopCard) card;
            System.out.println(cardaDanno.getName() + "danni" + cardaDanno.getDamage() + "vita" + cardaDanno.getHitPoints());
        }else if(card instanceof SpellCard){
            SpellCard cartaIncantesimo = (SpellCard) card;
            System.out.println(cartaIncantesimo.toString());
        }
    }
}
