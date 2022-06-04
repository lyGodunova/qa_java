package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class catTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void testGetSound() {
     String actual = cat.getSound();
     Assert.assertEquals("Мяу", actual);
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> actual= cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }
}
