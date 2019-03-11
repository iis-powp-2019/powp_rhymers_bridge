package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HanoiRhymerJUnitTest {

    private HanoiRhymer rhymer;
    private static final int[] VALUES = new int[]{1, 2, 3};

    @Before
    public void initialize(){
        rhymer = new HanoiRhymer();
    }

    @Test
    public void countInTest(){
        int totalRejected = 2;

        for (int value:VALUES){
            rhymer.countIn(value);
        }

        Assert.assertEquals(totalRejected,rhymer.reportRejected());
        Assert.assertEquals(VALUES[0],rhymer.countOut());
    }
}
