package com.serenitydojo;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhenWorkingOnAssertions {

    @Test
    public void shouldAddTwoIntegersCorrectly(){

        int a = 1;
        int b = 2;

        int sum = a+b;

        Assert.assertEquals(3,sum);
        //Assertions.assertThat(sum).isEqualTo(3); //assertj library - Integer assertion
        assertThat(sum).isEqualTo(3); //assertj library - Integer assertion
        assertThat(sum).isGreaterThan(1);
        assertThat(sum).isLessThan(10);
        assertThat(sum).isBetween(1,5);


    }

    @Test
    public void stringAssertions(){

        String color = "red";
        String otherColor = "red";
        String colors = "red, green,blue";

        assertThat(color).isEqualTo(otherColor);
        assertThat(colors).containsIgnoringCase("RED");

    }

    @Test
    public void collectionAssrtions(){

        List<String> colors = Arrays.asList("red","green","blue");

        assertThat(colors).hasSize(3);
        assertThat(colors).contains("green");
        assertThat(colors).containsExactlyInAnyOrder("blue","green","red");
        assertThat(colors).doesNotContain("red");

    }

}
