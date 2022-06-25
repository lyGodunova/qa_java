package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sex;
    private final boolean expected;

    public LionTest (String sex, boolean expected)throws Exception{
        this.sex = sex;
        this.expected = expected;
    }

        @Parameterized.Parameters // добавили аннотацию
        public static Object[][] getData() {
            return new Object[][] {
                    {"Самец", true},
                    {"Самка", false},
            };
        }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline feline;

    @Test
    public void testGetKittensLion() throws Exception {
        Lion lion = new Lion(feline, sex);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(feline, sex);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
        List<String> actual= lion.getFood();
        Assert.assertEquals(expected, actual);
    }
    }