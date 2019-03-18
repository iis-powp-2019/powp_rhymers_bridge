package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HanoiRhymerTest {
    private HanoiRhymer hanoiRhymer = new HanoiRhymer();

    @Test
    public void countIn() {
        final int testValue = 4;
        hanoiRhymer.countIn(testValue);
        int result = hanoiRhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }


}