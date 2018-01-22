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

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean compareTo(Owner someOwner) {
        return this.id.equals(someOwner.getId());
    }

    @Override
    public String toString() {
        return "[id: " + this.id + "] name: " + this.name + " type: " + this.type;
    }
}
