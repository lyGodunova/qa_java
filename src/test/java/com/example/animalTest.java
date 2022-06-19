package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class animalTest {
    private final String animalKind;
    private final List<String> expected;

    public animalTest (String animalKind, List<String> expected)throws Exception{
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    Animal animal = new Animal();

    @Test
    public void testGetFamily(){
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFood() throws Exception {
        List<String> actual= animal.getFood(animalKind);
        Assert.assertEquals(expected, actual);
    }
}
