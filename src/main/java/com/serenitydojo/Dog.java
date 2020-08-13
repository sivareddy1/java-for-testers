package com.serenitydojo;

public class Dog extends PetAnimal  {

    //private String name;  // declared in PetAnimal class
    //private int age;
    private String favouriteGame;
    public static final String DOG_NOISE = "Woof";

    public Dog(String name, String favouriteGame, int age) {
       super(name,age);
        //this.name = name;
       this.favouriteGame = favouriteGame;
       //this.age = age;
    }

    public Dog(String name, int age) {
        super(name,age);
    //this.name = name;
    // this.age = age;
    }

   /* public String getName() {
        return name;
    }*/

   public String getFavouriteGame(){ return favouriteGame; }

    /*public int getAge() {
        return age;
    }*/

    @Override
    public String  makeNoise(){ return DOG_NOISE; }

    @Override
    public String play(){return " plays with bone";}
}
