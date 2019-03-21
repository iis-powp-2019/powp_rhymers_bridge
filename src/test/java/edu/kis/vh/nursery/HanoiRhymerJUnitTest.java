package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerJUnitTest {

    @Test
    public void testCountIn()
    {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();

        final int TEST_VALUES[] = {3,2,1};
        int amountOfRejectedValues = 0;

        for(int value: TEST_VALUES)
            hanoiRhymer.countIn(value);

        int result = hanoiRhymer.getTotalRejected();
        Assert.assertEquals(result, amountOfRejectedValues);

        amountOfRejectedValues = 2;
        for(int value: TEST_VALUES)
            hanoiRhymer.countIn(value);

        result = hanoiRhymer.getTotalRejected();
        Assert.assertEquals(amountOfRejectedValues, result);
    }
}
