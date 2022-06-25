package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class LionThrowsTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void testThrowsVariant1() throws Exception {
        Lion lion = new Lion(feline, "Трансгендер");
    }

    @Test
    public void testThrowsVariant2() throws Exception {
        Exception exception = null;
        try{
            Lion lion = new Lion(feline, "Трансгендер");
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertNotEquals(null, exception);

        String actual = exception.getMessage();
        String expected = "Используйте допустимые значения пола животного - самей или самка";
        Assert.assertEquals(expected, actual);
    }
}
