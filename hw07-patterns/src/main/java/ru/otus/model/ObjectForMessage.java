package ru.otus.model;

import java.util.ArrayList;
import java.util.List;

public class ObjectForMessage implements Cloneable{
    private List<String> data;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public ObjectForMessage clone() {
        ObjectForMessage objectForMessageCloned = new ObjectForMessage();
        objectForMessageCloned.setData(new ArrayList<>(this.getData()));
        return objectForMessageCloned;
    }
}
