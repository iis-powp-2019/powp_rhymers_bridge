package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {

    @Test
    public void testCountInShouldntReject(){

        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        hanoiRhymer.countIn(3);
        hanoiRhymer.countIn(2);
        hanoiRhymer.countIn(1);

        int result = hanoiRhymer.getTotalRejected();
        final int HOW_MANY_REJECTED = 0;

        Assert.assertEquals(HOW_MANY_REJECTED,result);
    }

    @Test
    public void testCountInShouldRejectTwo(){

        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        hanoiRhymer.countIn(1);
        hanoiRhymer.countIn(2);
        hanoiRhymer.countIn(3);

        int result = hanoiRhymer.getTotalRejected();
        final int HOW_MANY_REJECTED = 2;

        Assert.assertEquals(HOW_MANY_REJECTED,result);

    }

}
