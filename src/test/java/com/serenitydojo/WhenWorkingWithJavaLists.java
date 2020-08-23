package com.serenitydojo;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.assertj.core.api.Assertions.*;
//import static org.assertj.core.api.Assertions.assertThat;
public class WhenWorkingWithJavaLists {

    @Test

    public void creatingASimpleList(){

        List simpleList = new ArrayList(); //List simpleList = new LinkedList(); //ArrayList and LinkedList are similar how ever LinkedList uses less memory internally so its a bit faster

        simpleList.add("Andy"); //add is a method
        simpleList.add(34);

        //assertThat(simpleList).contains("Andy",34);
        assertThat(simpleList).containsExactly("Andy",34);
    }

    @Test
    public void creatingATypedList(){

        List<String> names = new ArrayList<>();
        names.add("Alpha");
        names.add("Bravo");
        names.add("Charlie");
        names.add("Delta");

        assertThat(names).contains("Alpha","Bravo","Charlie", "Delta");
    }

    @Test
    public void creatingATypedListUsingArraysAsList(){

        List<String> names = Arrays.asList("Alpha","Bravo","Charlie", "Delta"); //This is called immutable list - whose data cannot be manipulated later
        List<Integer> ages = Arrays.asList(10,20,30,40);

        assertThat(names).contains("Alpha","Bravo","Charlie", "Delta");
        assertThat(ages).contains(10,20,30,40);

    }

    @Test
    public void removingStuffFromList(){

        List<String> names = new ArrayList<>();
        names.add("Alpha");
        names.add("Bravo");
        names.add("Charlie");
        names.add("Delta");

        names.remove("Bravo"); //remove is a method

        assertThat(names).contains("Alpha","Charlie", "Delta");
    }

    @Test
    public void immutableLists(){

        List<String> names = Arrays.asList("Alpha","Bravo","Charlie", "Delta"); // Constant List: this type of list is created for usually lists that will not change later

        names.remove("Bravo"); // cannot perform this as "names" is an immutable list
        names.add("Echo"); // cannot perform this as "names" is an immutable list

    }

    @Test
    public void findElementsInAList(){
        List<String> names = Arrays.asList("Alpha","Bravo","Charlie", "Delta", "Bravo","Echo");

        int indexOfBravo = names.indexOf("Bravo"); //index of is a method
        int lastIndexOfBravo = names.lastIndexOf("Bravo"); //lastIndexof is a method

        assertThat(indexOfBravo).isEqualTo(1);
        assertThat(lastIndexOfBravo).isEqualTo(4);
    }

    @Test
    public void findingASubList(){
        List<String> names = Arrays.asList("Alpha","Bravo","Charlie", "Delta", "Bravo","Echo");

        List<String> middleNames = names.subList(1,4);  //sublist is a method
        assertThat(middleNames).contains("Bravo","Charlie", "Delta");
    }

    @Test
    public void findingTheSizeOfList(){
        List<String> names = Arrays.asList("Alpha","Bravo","Charlie", "Delta", "Bravo","Echo");

        int sizeOfNamesList = names.size();   //Size is a method
        System.out.println(sizeOfNamesList);
        assertThat(names.size()).isEqualTo(6);
    }

    @Test
    public void removeStuffFromListUsingClear(){

        List<String> names = new ArrayList<>();
        names.add("Alpha");
        names.add("Bravo");
        names.add("Charlie");
        names.add("Delta");

        names.clear(); //clear is a method
        assertThat(names).isEmpty(); // we can check size is zero
        assertThat(names.size()).isEqualTo(0);
    }

    @Test
    public void convertingAListToASet(){
        // Difference between List and Set are that a set contains unique values only and set does not care about order.

      List<String> names = Arrays.asList("Andy","Brain","Chiran", "Andy", "Dan","Esther");

      Set<String> uniqueNames = new HashSet<>(names);

      assertThat(uniqueNames).containsExactlyInAnyOrder("Andy","Brain","Chiran","Dan","Esther");
    }

    @Test
    public void sortingAList(){
        List<String> names = Arrays.asList("Andy","Brain","Chiran", "Andy", "Dan","Esther");

        Collections.sort(names);


        assertThat(names).containsExactly("Andy","Andy","Brain","Chiran","Dan","Esther");
    }

    @Test
    public void findingMaxAndMinValue(){
        List<Integer> ages = Arrays.asList(10,40,80,120,4,35);

        assertThat(Collections.max(ages)).isEqualTo(120);
        assertThat(Collections.min(ages)).isEqualTo(4);

    }

    @Test
    public void combiningLists(){

        List<String> names = new ArrayList<>();
        names.add("Andy");
        names.add("Brain");

        List<String> moreNames = new ArrayList<>();
        moreNames.add("Charlie");
        moreNames.add("Dan");

        System.out.println(names);
        names.addAll(moreNames);  //add all is a method
        System.out.println(names);


        assertThat(names).containsExactly("Andy","Brain","Charlie","Dan");

        names.removeAll(moreNames); //remove all is a method

        System.out.println(names);
        assertThat(names).contains("Andy","Brain");

    }


}
