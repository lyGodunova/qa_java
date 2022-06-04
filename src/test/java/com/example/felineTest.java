package com.example;

import org.junit.Assert;
import org.junit.Test;

public class felineTest {
    Feline feline = new Feline();

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
    public void testGetKittensWithKittensCount() {

    }
}
