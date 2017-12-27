package caracole;

import interfaceActions.StackActions;

public abstract class StackBean implements StackActions {
    private String id;
    private boolean isVisible;
    private Object cards[];
    private Owner owner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public Object[] getCards() {
        return cards;
    }

    public void setCards(Object[] cards) {
        this.cards = cards;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
