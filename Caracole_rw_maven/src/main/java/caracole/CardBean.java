package caracole;

import interfaceActions.CardActions;

public abstract class CardBean implements CardActions {
    private String id;
    private boolean isVisible;
    private String faceValue;
    private Owner owner;

    protected String getId() {
        return id;
    }
    protected void setId(String id) {
        this.id = id;
    }

    protected boolean isVisible() {
        return isVisible;
    }
    void setVisible(boolean visible) {
        isVisible = visible;
    }

    String getFaceValue() {
        return faceValue;
    }
    protected void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }

    Owner getOwner() {
        return owner;
    }
    void setOwner(Owner owner) {
        this.owner = owner;
    }
}
