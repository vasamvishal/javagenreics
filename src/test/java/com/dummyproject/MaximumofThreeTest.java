package com.dummyproject;

import org.junit.Assert;
import org.junit.Test;

public class MaximumofThreeTest {
    @Test
    public void shouldReturn_Maximum_forIntegers() {
        MaximumofThreeClass maximum = new MaximumofThreeClass();
        Integer integers = maximum.threeIntegers();
        Assert.assertSame(30, integers);
    }
    @Test
    public void shouldReturn_Maximum_forCharacters() {
        MaximumofThreeClass maximum = new MaximumofThreeClass();
        Character character = maximum.threeCharacters();
        Assert.assertSame('c',character);
    }
    @Test
    public void shouldReturn_Maximum_forFloat() {
        MaximumofThreeClass maximum = new MaximumofThreeClass();
        Float aFloat = maximum.threeFloat();
        Assert.assertEquals(3.0f,aFloat,0.01);
    }
}
