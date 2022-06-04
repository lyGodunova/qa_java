package com.example;

import org.junit.Assert;
import org.junit.Test;

public class LionTest {
    Feline feline = new Feline();
    Lion lion;

    @Test
    public void testGetKittensLion() {

    }
    @Test
    public void testDoesHaveMane() {
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(true, actual);

    }
    @Test
    public void testGetFood() {

    }
}
