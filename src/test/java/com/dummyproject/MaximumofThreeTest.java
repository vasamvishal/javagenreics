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
}
