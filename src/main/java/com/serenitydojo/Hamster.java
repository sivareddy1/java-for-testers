package com.serenitydojo;

public class Hamster extends PetAnimal {

    //private String name;
    private String favouriteGame;
    //private int age;
    public static final String HAMSTER_NOISE = "Squeak";

    public Hamster(String name) {
        super(name);
        //this.name=name;
    }

    public Hamster(String name, int age) {
        super(name,age);
        //this.name=name;
        //this.favouriteGame = favouriteGame;
    }


    public Hamster(String name, String favouriteGame) {
        super(name);
        //this.name=name;
        this.favouriteGame = favouriteGame;
    }

    public Hamster(String name, String favouriteGame, int age) {
        super(name,age);
        //this.name=name;
        this.favouriteGame = favouriteGame;
        //this.age = age;
    }


    public String getFavouriteGame(){ return favouriteGame; }

    /*public int getAge() {
        return age;
    }*/

    @Override
    public String makeNoise(){ return HAMSTER_NOISE; }

    /*public String  getName() {
        return name;
    }*/

    @Override
    public String play(){return " runs in wheel";}


}
