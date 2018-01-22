package com.SCP.caracole.resources;

public enum FullCardList {
    SPADES_1 ("as de pique",     "SPADES",  1, "U+1F0A1"),
    SPADES_2 ("deux de pique",   "SPADES",  2, "U+1F0A2"),
    SPADES_3 ("trois de pique",  "SPADES",  3, "U+1F0A3"),
    SPADES_4 ("quatre de pique", "SPADES",  4, "U+1F0A4"),
    SPADES_5 ("cinq de pique",   "SPADES",  5, "U+1F0A5"),
    SPADES_6 ("six de pique",    "SPADES",  6, "U+1F0A6"),
    SPADES_7 ("sept de pique",   "SPADES",  7, "U+1F0A7"),
    SPADES_8 ("huit de pique",   "SPADES",  8, "U+1F0A8"),
    SPADES_9 ("neuf de pique",   "SPADES",  9, "U+1F0A9"),
    SPADES_10("dix de pique",    "SPADES", 10, "U+1F0AA"),
    SPADES_11("valet de pique",  "SPADES", 10, "U+1F0AB"),
    SPADES_12("dame de pique",   "SPADES", 10, "U+1F0AD"),
    SPADES_13("roi de pique",    "SPADES", 10, "U+1F0AE"),

    HEARTS_1 ("as de coeur",     "HEARTS",  1, "U+1F0B1"),
    HEARTS_2 ("deux de coeur",   "HEARTS",  2, "U+1F0B2"),
    HEARTS_3 ("trois de coeur",  "HEARTS",  3, "U+1F0B3"),
    HEARTS_4 ("quatre de coeur", "HEARTS",  4, "U+1F0B4"),
    HEARTS_5 ("cinq de coeur",   "HEARTS",  5, "U+1F0B5"),
    HEARTS_6 ("six de coeur",    "HEARTS",  6, "U+1F0B6"),
    HEARTS_7 ("sept de coeur",   "HEARTS",  7, "U+1F0B7"),
    HEARTS_8 ("huit de coeur",   "HEARTS",  8, "U+1F0B8"),
    HEARTS_9 ("neuf de coeur",   "HEARTS",  9, "U+1F0B9"),
    HEARTS_10("dix de coeur",    "HEARTS", 10, "U+1F0BA"),
    HEARTS_11("valet de coeur",  "HEARTS", 10, "U+1F0BB"),
    HEARTS_12("dame de coeur",   "HEARTS", 10, "U+1F0BD"),
    HEARTS_13("roi de coeur",    "HEARTS", 10, "U+1F0BE"),

    DIAMONDS_1 ("as de carreau",     "DIAMONDS",  1, "U+1F0C1"),
    DIAMONDS_2 ("deux de carreau",   "DIAMONDS",  2, "U+1F0C2"),
    DIAMONDS_3 ("trois de carreau",  "DIAMONDS",  3, "U+1F0C3"),
    DIAMONDS_4 ("quatre de carreau", "DIAMONDS",  4, "U+1F0C4"),
    DIAMONDS_5 ("cinq de carreau",   "DIAMONDS",  5, "U+1F0C5"),
    DIAMONDS_6 ("six de carreau",    "DIAMONDS",  6, "U+1F0C6"),
    DIAMONDS_7 ("sept de carreau",   "DIAMONDS",  7, "U+1F0C7"),
    DIAMONDS_8 ("huit de carreau",   "DIAMONDS",  8, "U+1F0C8"),
    DIAMONDS_9 ("neuf de carreau",   "DIAMONDS",  9, "U+1F0C9"),
    DIAMONDS_10("dix de carreau",    "DIAMONDS", 10, "U+1F0CA"),
    DIAMONDS_11("valet de carreau",  "DIAMONDS", 10, "U+1F0CB"),
    DIAMONDS_12("dame de carreau",   "DIAMONDS", 10, "U+1F0CD"),
    DIAMONDS_13("roi de carreau",    "DIAMONDS", 10, "U+1F0CE"),

    CLUBS_1 ("as de treffle",     "CLUBS",  1, "U+1F0D1"),
    CLUBS_2 ("deux de treffle",   "CLUBS",  2, "U+1F0D2"),
    CLUBS_3 ("trois de treffle",  "CLUBS",  3, "U+1F0D3"),
    CLUBS_4 ("quatre de treffle", "CLUBS",  4, "U+1F0D4"),
    CLUBS_5 ("cinq de treffle",   "CLUBS",  5, "U+1F0D5"),
    CLUBS_6 ("six de treffle",    "CLUBS",  6, "U+1F0D6"),
    CLUBS_7 ("sept de treffle",   "CLUBS",  7, "U+1F0D7"),
    CLUBS_8 ("huit de treffle",   "CLUBS",  8, "U+1F0D8"),
    CLUBS_9 ("neuf de treffle",   "CLUBS",  9, "U+1F0D9"),
    CLUBS_10("dix de treffle",    "CLUBS", 10, "U+1F0DA"),
    CLUBS_11("valet de treffle",  "CLUBS", 10, "U+1F0DB"),
    CLUBS_12("dame de treffle",   "CLUBS", 10, "U+1F0DD"),
    CLUBS_13("roi de treffle",    "CLUBS", 10, "U+1F0DE"),

    JOKER_1("joker rouge",        "JOKER",  0, "U+1F0BF"),
    JOKER_2("joker blanc",        "JOKER",  0, "U+1F0DF");

    private String displayName, suit, unicode;
    private int point;

    FullCardList(String name, String suit, int point, String unicode) {
        this.displayName = name;
        this.suit = suit;
        this.point = point;
        this.unicode = unicode;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSuit() {
        return suit;
    }

    public String getUnicode() {
        return unicode;
    }

    public int getPoint() {
        return point;
    }
}
