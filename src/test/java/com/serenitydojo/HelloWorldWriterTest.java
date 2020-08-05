package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorldToConsole();
    }

    @Test
    public void declaringNumericalVariables(){
        int ageThisYear = 35; // or we can use Integer age = 35, Integer is a class in java and can use different default functions using Integer
        int ageNextYear = ageThisYear+10;

        long starsInTheGalaxy = 1000000000L;

        double weight = 10.690;

        System.out.println(ageNextYear);
    }

    @Test
    public void workingWithStringVariables(){

        String firstName = "  Siva-Test   ";
        String replacedFirstName=firstName.replace("Test","Reddy");
        System.out.println(firstName.toUpperCase());
        System.out.println(firstName.trim());
        System.out.println(replacedFirstName.toUpperCase());

    }
}
