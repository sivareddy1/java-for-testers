package com.serenitydojo;

public class Dog {
    private String name;
    private int age;
    private String favouriteGame;

    public Dog(String name, String favouriteGame, int age) {
        this.name = name;
        this.favouriteGame = favouriteGame;
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getfavouriteGame() {
        return favouriteGame;
    }

    public int getAge() {
        return age;
    }
}
