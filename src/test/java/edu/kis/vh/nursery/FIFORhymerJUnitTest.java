package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;


public class FIFORhymerJUnitTest {

    @Test
    public void testCountOut() {
        FIFORhymer fifoRhymer = new FIFORhymer();
        final int EMPTY_STACK_HEAD_INDEX = -1;
        final int VALUES_FOR_FIFO_TEST[] = {1, 2, 3};

        int result = fifoRhymer.countOut();
        Assert.assertEquals(result, EMPTY_STACK_HEAD_INDEX);

        for (int number : VALUES_FOR_FIFO_TEST) {
            fifoRhymer.countIn(number);
        }

        for (int number : VALUES_FOR_FIFO_TEST) {
            result = fifoRhymer.countOut();
            Assert.assertEquals(result, number);
        }
    }
}

