package com.dummyproject;

import org.junit.Assert;
import org.junit.Test;

public class MaximumofThreeTest {
    @Test
    public void shouldReturn_Maximum_forIntegers() {
        MaximumofThreeClass maximum = new MaximumofThreeClass();
        Integer integer = maximum.printArray(10,20,30);
        Assert.assertSame(30, integer);
    }

    @Test
    public void shouldReturn_Maximum_forCharacters() {
        MaximumofThreeClass maximum = new MaximumofThreeClass();
        Character character = maximum.printArray('a','b','c');
        Assert.assertSame('c',character);
    }

    @Test
    public void shouldReturn_Maximum_forFloat() {
        MaximumofThreeClass maximum = new MaximumofThreeClass();
        Float aFloat = maximum.printArray(1.0f,2.0f,3.0f);
        Assert.assertEquals(3.0f,aFloat,0.01);
    }
}
