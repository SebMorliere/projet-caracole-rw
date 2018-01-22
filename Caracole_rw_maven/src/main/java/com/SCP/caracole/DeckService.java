package com.SCP.caracole;

public class DeckService {
    private static DeckService ourInstance = new DeckService();

    public static DeckService getInstance() {
        return ourInstance;
    }

    private DeckService() {
    }
}
