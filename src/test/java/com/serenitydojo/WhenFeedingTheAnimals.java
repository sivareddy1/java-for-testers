package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Test
    public void collections(){

        // Arrays

        String[] colors = {"Red","Blue","Green"};
        int[] ages = {1,1,1};
        String[] arrayOfColors = new String[4];
        int[] arrayOfNumbers = new int[5];
        arrayOfColors[0]="Red";
        arrayOfColors[1]="Blue";
        arrayOfColors[2]="Green";
        arrayOfColors[3]="Yellow";
        //System.out.println("First Color is " + arrayOfColors[0]);

        //Loops

        for (int i=0;i<4;i++){
            System.out.println("Color is " + arrayOfColors[i] );
            }

        System.out.println("-----------------------------------------------------");
        //Lists

        List<Integer> myNumbers = new ArrayList<>();
        List<String> myColors = new ArrayList<>();

        myColors.add("Red"); // .add is method in List class which allows us to add variable value
        myColors.add("Blue");
        myColors.add("Green");
        myColors.add("Yellow");
        myColors.add("Purple");
        myColors.add("Black");
        myColors.add("White");
        myColors.add("Red");

        System.out.println(myColors.get(0)); // .get is method in List class which allows us to add variable value
        System.out.println(myColors.get(6));
        System.out.println("-----------------------------------------------------");
        for(String someColor:myColors){
            System.out.println("Color is : " + someColor);
        }
        System.out.println("-----------------------------------------------------");

        Set<Integer> setOfMyNumbers = new HashSet<>();
        Set<String> setOfMyColors = new HashSet<>();

        setOfMyColors.add("Red"); // .add is method in Set class which allows us to add variable value
        setOfMyColors.add("Blue");
        setOfMyColors.add("Green");
        setOfMyColors.add("Yellow");
        setOfMyColors.add("Purple");
        setOfMyColors.add("Black");
        setOfMyColors.add("White");
        setOfMyColors.add("Red");

        for(String someColor:setOfMyColors){
            System.out.println("Color is : " + someColor);
        }

    }

}
