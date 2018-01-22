package com.SCP.caracole;

import javax.persistence.*;
import java.util.Stack;

@Entity
public class Deck extends CardStack {

    //TODO: handle exceptions properly
    //TODO: improve setting name and type with shared constants

    @Id
    @GeneratedValue
    private Long id;

    public Deck() throws Exception {
    }

    public Deck(Stack<Card> cards) throws Exception {
        if (this.size() == 0) {
            this.setCards(cards);
            this.setVisible(false);
            this.setOwner(new Owner("caracole game", "npc"));
        } else throw new Exception("redifining deck is forbidden");
    }

    @Override
    public String toString() {
        return "caracole.Deck{" +
                "owner= " + this.getOwner()+
                ", isVisible= " + this.isVisible() +
                ", cards= " + this.getCards().toString() +
                '}';
    }
}
