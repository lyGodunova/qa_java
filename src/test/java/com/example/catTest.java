package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

public class catTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Predator predator;

    @Test
    public void testGetSound() {
     String actual = cat.getSound();
     Assert.assertEquals("Мяу", actual);
    }

    @Test
    public void testGetFood() throws Exception {
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual= cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }
}
