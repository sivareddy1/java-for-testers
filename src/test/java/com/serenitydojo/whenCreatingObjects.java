package com.serenitydojo;

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
        System.out.println(rocky.getfavouriteGame());
        System.out.println(rocky.getAge());

        Dog dolly = new Dog("Dolly",10);
        System.out.println(dolly.getName());
        System.out.println(dolly.getfavouriteGame());
        System.out.println(dolly.getAge());
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
        poppy.makeNoise();
        spotty.makeNoise();
        //poppy.feed("Tuna");
        //spotty.feed("Salmon");
        //poppy.groom();

    }




}
