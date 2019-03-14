package edu.kis.vh.nursery;

import org.junit.Test;

import static org.junit.Assert.*;

public class FIFORhymerTest {

    @Test
    public void countOut() {
        FIFORhymer fifoRhymer = new FIFORhymer();
        int expctedValue = 1;
        int unexpcetedValue = 2;
        fifoRhymer.countIn(expctedValue);
        fifoRhymer.countIn(unexpcetedValue);
        int countOut = fifoRhymer.countOut();
        assertNotEquals(unexpcetedValue, countOut);
        assertEquals(expctedValue, countOut);
    }
}