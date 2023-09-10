package org.example;

public class IDGenerator {
    private int currentID = 0;

    public int nextID() {
        return ++currentID;
    }
}
