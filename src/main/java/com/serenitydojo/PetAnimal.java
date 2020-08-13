package com.serenitydojo;

public abstract class PetAnimal {
    private String name;
    private int age;

    public PetAnimal(String name){
        this.name=name;
     }

    public PetAnimal(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){ return name; }

    public int getAge(){return age; }

    public abstract String makeNoise();

    public abstract String play();
}
