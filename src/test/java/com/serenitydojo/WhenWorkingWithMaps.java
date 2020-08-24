package com.serenitydojo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.*;

public class WhenWorkingWithMaps {

    @Test
    public void creatingAMap(){

        Map<String, Integer> numberOfBallsByColor = new HashMap<>();

        numberOfBallsByColor.put("red",3);   //put is a method
        numberOfBallsByColor.put("green",6);
        numberOfBallsByColor.put("blue",5);

        int numberOfRedBalls = numberOfBallsByColor.get("red"); //get is a method

        System.out.println("Number of Red Balls are: " + numberOfRedBalls);

    }

    @Test
    public void creatingMapMorePrecisely(){
        Map<String,Integer> numberOfBallsByColor = Map.of("red",3,"green",6,"blue",5);

        Map<String,Integer> moreColors = new HashMap<>();

        moreColors.put("yellow",8);
        moreColors.putAll(numberOfBallsByColor);
        moreColors.put("brown",0);
        //System.out.println(moreColors.get("yellow"));
        //System.out.println(moreColors.get("red"));

        System.out.println("Number of white color balls are " + moreColors.get("white"));
        System.out.println("Number of white color balls are " + moreColors.getOrDefault("white",0)); //using default we can throw zero as output

        System.out.println("Purple tennis balls present: " + moreColors.containsKey("purple"));
        System.out.println("Brown tennis balls present: " + moreColors.containsKey("brown"));

        moreColors.put("yellow",25);
        moreColors.replace("pink", 30); //replace does not change the map, unless the key is already present in the map

        System.out.println("Number of yellow balls: " + moreColors.getOrDefault("yellow",0));
        System.out.println("Number of Pink balls: " + moreColors.getOrDefault("pink",0));
    }

    @Test
    public void iteratingOverMapKeys(){

        Map<String,Integer> numberOfBallsByColor = Map.of("red",3,"green",6,"blue",5);

        System.out.println("Keys = " + numberOfBallsByColor.keySet()); //order is not considered as Map is a Set which is not particular about order

/*        for (String key: numberOfBallsByColor.keySet()){
            int numberOfTennisBalls = numberOfBallsByColor.get(key);
            System.out.println(key + "=>" + numberOfTennisBalls);
        }*/

        for (Map.Entry<String,Integer> entry: numberOfBallsByColor.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        System.out.println("--------------------------------------------------");

        //numberOfBallsByColor.replace("red",45); // this cannot be done, as Map.of() creates a constant map that cannot be updated/edited

        //System.out.println(numberOfBallsByColor.get("red"));

        Map<String,Integer> modifiableMap= new HashMap<>();

        modifiableMap.putAll(numberOfBallsByColor);
        modifiableMap.put("black",30);

        for(Map.Entry<String,Integer> entry1: modifiableMap.entrySet()){
            System.out.println(entry1.getKey() + "--->" + entry1.getValue());
        }
        System.out.println("--------------------------------------------------");



        modifiableMap.remove("red");

        for(Map.Entry<String,Integer> entry2: modifiableMap.entrySet()){
            System.out.println(entry2.getKey() + "--->" + entry2.getValue());
        }
        System.out.println("--------------------------------------------------");


        modifiableMap.clear();
        for(Map.Entry<String,Integer> entry3: modifiableMap.entrySet()){
            System.out.println("nothing to print here as 'modifiable map is cleared' : " + entry3.getKey() + "--->" + entry3.getValue());
        }

    }



}
