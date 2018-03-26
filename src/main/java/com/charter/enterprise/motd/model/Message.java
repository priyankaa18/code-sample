package com.charter.enterprise.motd.model;

public class Message {
    private String value;

    //Default Constructor
    public Message() {
        this.value = "";
    }

    public Message(String message) {
        this.value = message;
    }

    public String getValue() {
        return this.value;
    } 

    public void setValue(String val) {
        this.value = val;
    }

    @Override
    public String toString() {
        return "Message{" +
                "value='" + value + '\'' +
                '}';
    }
}