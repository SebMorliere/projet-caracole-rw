package com.SCP.caracole;

import com.SCP.GameHandler;

public class CaracoleHandler implements GameHandler {
    @Override
    public String getGameType() {
        return "caracole";
    }

    @Override
    public void start() {
        System.out.println(" ** " + this.getClass());
        // createNewGame();
        // generateDeck();
    }

    @Override
    public void phases() {
        // firstTurn();
        // nextTurn();
    }

    @Override
    public void end() {
        // closeGame();
    }
}
