package com.SCP.caracole;

import javax.persistence.*;
import java.util.List;
import java.util.Stack;

@MappedSuperclass
public abstract class CardStack {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
//    private Stack<Card> cards;
    private List<Card> cards = new Stack<>();

    private boolean isVisible;

//    @OneToOne(fetch = FetchType.LAZY, targetEntity = Owner.class)
//    @JoinColumn(name = "id")
    @OneToOne
    @PrimaryKeyJoinColumn
    private Owner owner;

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(Stack<Card> cards) {
        this.cards = cards;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int size() {
        return cards.size();
    }

    @Override
    public String toString() {
        return "Stack of cards{" +
                "owner= " + owner +
                ", isVisible= " + isVisible +
                ", cards= " + cards +
                '}';
    }

}
