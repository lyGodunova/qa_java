package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class felineTest {
    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        List<String> actual= feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFamily() {
        String actual = feline.getFamily();
        Assert.assertEquals("Кошачьи", actual);
    }

    @Test
    public void testGetKittens() {
    int actual = feline.getKittens();
    Assert.assertEquals(1, actual);
    }

    @Test
    public void testGetKittensWithkittensCount() {
        int actual = feline.getKittens(5);
        Assert.assertEquals(5, actual);
    }
}
