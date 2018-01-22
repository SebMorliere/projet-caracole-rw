package com.SCP.caracole;

import java.util.Stack;

public class CardStackService {
    public Stack<Card> shuffleStack(Stack<Card> cards) {
        // change randomly cards order
        return cards;
    }

    public Stack<Card> halfCutStack(Stack<Card> cards) {
        // pick random number of top cards (around half of stack) and put it bottom
        return cards;
    }

    public Stack<Card> stackUp(Card card, Stack<Card> cards) {
        // add card(s) on top of stack
        return cards;
    }

    public Stack<Card> stackDown(Card card, Stack<Card> cards) {
        // add card(s) on bottom of stack
        return cards;
    }

    public Stack<Card> invertStack(Stack<Card> cards) {
        // reverse cards order
        return cards;
    }
}
