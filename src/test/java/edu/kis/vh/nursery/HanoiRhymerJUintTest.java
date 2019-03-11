package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerJUintTest {

    @Test
    public void testCountIn() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();

        final int TEST_NUMBERS[] = {3, 2, 1};
        int rejected = 0;

        for (int number : TEST_NUMBERS)
            hanoiRhymer.countIn(number);

        int result = hanoiRhymer.getTotalRejected();
        Assert.assertEquals(result, rejected);

        rejected = 2;
        for (int number : TEST_NUMBERS)
            hanoiRhymer.countIn(number);

        result = hanoiRhymer.getTotalRejected();
        Assert.assertEquals(rejected, result);
    }
}