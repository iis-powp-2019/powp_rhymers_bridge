package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FIFORhymerTest {
   private FIFORhymer fifoRhymer = new FIFORhymer();
    @Test
    public void testCountOut() {
        int testValue =4;
        fifoRhymer.countIn(testValue);
        int result = fifoRhymer.countOut();
        Assert.assertEquals(testValue, result);
      }
}