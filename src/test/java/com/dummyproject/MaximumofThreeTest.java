package com.dummyproject;

import org.junit.Assert;
import org.junit.Test;

public class MaximumofThreeTest {
    @Test
    public void shouldReturn_Maximum_forIntegers() {
        MaximumofThreeClass<Integer> integerMaximumofThreeClass = new MaximumofThreeClass<>(10, 20, 30);
        Integer comparable = integerMaximumofThreeClass.printArray();
        Assert.assertSame(30, comparable);
    }

    @Test
    public void shouldReturn_Maximum_forCharacters() {
        MaximumofThreeClass<Character> maximumofThreeClass = new MaximumofThreeClass<>('a', 'b', 'c');
        Character comparable = maximumofThreeClass.printArray();
        Assert.assertSame('c',comparable);
    }

    @Test
    public void shouldReturn_Maximum_forFloat() {
        MaximumofThreeClass<Float> maximumofThreeClass = new MaximumofThreeClass<>(1.0f, 2.0f, 3.0f);
        Float comparable = maximumofThreeClass.printArray();
        Assert.assertEquals(3.0f, comparable,0.01f);
    }
    @Test

    public void shouldreturn_Maximum_forIntegersValue() {
        MaximumofThreeClass<Integer> integerMaximumofThreeClass = new MaximumofThreeClass<>(2, 3, 5);
        Comparable comparable = integerMaximumofThreeClass.printArray();
        Assert.assertEquals(5,comparable);
    }
}
