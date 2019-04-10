package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntStorageInterface;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FIFORhymerTest {

    @Test
    public void countOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(IntStorageInterface.STACKEMPTY, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(IntStorageInterface.STACKEMPTY, result);

    }
}