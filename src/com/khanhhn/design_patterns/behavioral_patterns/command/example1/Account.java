package com.khanhhn.design_patterns.behavioral_patterns.command.example1;

public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Account [" + name + "] Opened\n");
    }

    public void close() {
        System.out.println("Account [" + name + "] Closed\n");
    }
}