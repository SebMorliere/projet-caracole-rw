package com.SCP.caracole;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Owner {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;

    public Owner() {
    }

    public Owner(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean compareTo(Owner someOwner) {
        return this.name.equals(someOwner.getName()) && this.type.equals(someOwner.getType());
    }

    @Override
    public String toString() {
        return "[id: " + this.id + "] name: " + this.name + " type: " + this.type;
    }
}
