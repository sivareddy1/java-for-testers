package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.Cat.usualFood;

public class whenCreatingObjects {

    @Test
    public void creating_a_cat(){
        /*String name = "Poppy";
        int age = 3;
        String favouriteFood = "Fish";*/

        Cat poppy = new Cat("Poppy","Fish",3);
        System.out.println(poppy.getName());
        System.out.println(poppy.getFavouriteFood());
        System.out.println(poppy.getAge());

        Cat spotty = new Cat("Spotty",2);
        System.out.println(spotty.getName());
        System.out.println(spotty.getFavouriteFood());
        System.out.println(spotty.getAge());
        //spotty.age = 5;
        //System.out.println(spotty.getAge());
    }

    @Test
    public void creating_a_dog(){

        Dog rocky = new Dog("Rocky", "Ball", 8);
        System.out.println(rocky.getName());
        System.out.println(rocky.getFavouriteGame());
        System.out.println(rocky.getAge());

        Dog dolly = new Dog("Dolly",10);
        System.out.println(dolly.getName());
        System.out.println(dolly.getFavouriteGame());
        System.out.println(dolly.getAge());
    }

    @Test
    public void creating_a_hamster(){
        Hamster ronny = new Hamster("Ronny");
        Hamster mickey = new Hamster("Mickey","Running");
        Hamster lilly = new Hamster("Lilly","Searching",2);
        System.out.println(ronny.getName());
        System.out.println(mickey.getName());
        System.out.println(mickey.getFavouriteGame());
        System.out.println(lilly.getAge());
        Assert.assertEquals(ronny.getName(),"Ronny");
        Assert.assertEquals(lilly.getAge(),2);
    }

    @Test
    public void cat_makes_noise(){
        Cat poppy = new Cat("Poppy",3);
        Cat spotty = new Cat("Spotty","Meat",2);

        //poppy.CAT_NOISE = "LOUD MEOW";
        //Cat.CAT_NOISE = "LOUD MEOW";
        //System.out.println("Usual Food is " + Cat.usualFood());
        //System.out.println(poppy.getName() + "'s Favourite food is " + poppy.usualFood());
        System.out.println("Cat's like " + usualFood());
        System.out.println(poppy.makeNoise());
        System.out.println("Poppy goes " + poppy.makeNoise());
        spotty.makeNoise();
        //poppy.feed("Tuna");
        //spotty.feed("Salmon");
        //poppy.groom();

    }

    @Test
    public void dog_makes_noise(){

        Dog rocky = new Dog("Rocky","Ball",8);
        System.out.println(rocky.makeNoise());
        System.out.println("Rocky goes " + rocky.makeNoise());
    }

    @Test
    public void hamster_makes_noise(){

        Hamster ronny = new Hamster("Ronny");
        System.out.println(ronny.makeNoise());
        System.out.println("Ronny goes " + ronny.makeNoise());
    }

    @Test
    public void pets_make_noises(){
        PetAnimal poppy = new Cat("Poppy", 3);
        PetAnimal rocky = new Dog("Rocky", 8);
        PetAnimal ronny = new Hamster("Ronny",1);

        System.out.println("Poppy goes " + poppy.makeNoise());
        System.out.println("Rocky goes " + rocky.makeNoise());
        System.out.println("Ronny Goes " + ronny.makeNoise());
    }

    @Test
    public void pets_play(){
        PetAnimal poppy = new Cat("Poppy", 3);
        PetAnimal rocky = new Dog("Rocky", 8);
        PetAnimal ronny = new Hamster("Ronny",1);

        System.out.println("Cat " + poppy.getName() + poppy.play());
        System.out.println("Dog " + rocky.getName() + rocky.play());
        System.out.println("Hamster " + ronny.getName() + ronny.play());

        Assert.assertEquals(" plays with string",poppy.play());
        Assert.assertEquals(" plays with bone",rocky.play());
        Assert.assertEquals(" runs in wheel",ronny.play());

    }



}
