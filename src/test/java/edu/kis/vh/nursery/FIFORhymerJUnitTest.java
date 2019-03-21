package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerJUnitTest {

    @Test
    public void testCountOut()
    {
        FIFORhymer fifoRhymer = new FIFORhymer();
        final int EMPTY_STACK_VALUE = -1;
        final int TEST_VALUES[] = {1,2,3};

        int result = fifoRhymer.countOut();
        Assert.assertEquals(result, EMPTY_STACK_VALUE);

        for(int value: TEST_VALUES)
        {
            fifoRhymer.countIn(value);
        }

        for(int value: TEST_VALUES)
        {
            result = fifoRhymer.countOut();
            Assert.assertEquals(result, value);
        }
    }
}
