package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimalThrowsTest {
    Animal animal = new Animal();
    @Test
    public void testGetFoodThrow(){
        Exception exception = null;
        try {
            animal.getFood("Единорог");
        } catch (Exception e) {
            exception = e;
        }

        Assert.assertNotEquals(null, exception);

        String actual = exception.getMessage();
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Assert.assertEquals(expected, actual);
    }
}
