package com.codes.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codes.si.SimpleInterest;

public class SimpleInterestTest {

    @Test
    public void testZeroValue() {
        int expectedResult = 0;
        int generatedResult = new SimpleInterest().calSi(0, 7, 2);

        assertEquals("zero value test", expectedResult, generatedResult);
    }

}