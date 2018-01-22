package com.SCP.caracole;

import com.SCP.caracole.resources.FullCardList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Card {

    @Id
    @GeneratedValue
    private Long id;
    private FullCardList cardName;

    public String getDisplayName() {
        return cardName.getDisplayName();
    }
    public String getSuit() {
        return cardName.getSuit();
    }
    public int getPoint() {
        return cardName.getPoint();
    }
    public String getUnicode() {
        return cardName.getUnicode();
    }

    public Long getId() {
        return id;
    }
}
