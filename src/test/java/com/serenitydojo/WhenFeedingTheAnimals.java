package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.AnimalType.*;



public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna(){
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(CAT, false);
        System.out.println(food);
        Assert.assertEquals(FoodType.TUNA,food);
    }

    @Test
    public void shouldFeedHamstersCabbage(){
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(HAMSTER, false);
        System.out.println(food);
        Assert.assertEquals(FoodType.CABBAGE,food);
    }

    @Test
    public void shouldFeedDogsdogfood(){
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(DOG, false);
        System.out.println(food);
        Assert.assertEquals(FoodType.DOG_FOOD,food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumCatFood(){

        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(CAT, true);
        System.out.println(food);
        Assert.assertEquals(FoodType.SALMON,food);

    }

    @Test
    public void shouldFeedPremiumHamstersPremiumHamsterFood(){

        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(HAMSTER,true);
        System.out.println(food);
        Assert.assertEquals(FoodType.LETTUCE,food);

    }

    @Test
    public void shouldFeedPremiumDogsPremiumDogFood(){

        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(DOG,true);
        System.out.println(food);
        Assert.assertEquals(FoodType.PREMIUM_DOG_FOOD,food);

    }

}
