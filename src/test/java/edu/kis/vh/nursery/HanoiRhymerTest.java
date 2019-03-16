package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HanoiRhymerTest {

    @Test public void reportRejected(){
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        hanoiRhymer.countIn(4);
        hanoiRhymer.countIn(3);
        hanoiRhymer.countIn(2);
        hanoiRhymer.countIn(1);

        final int HOW_MANY_REJECTED = 0;
        int result = hanoiRhymer.getTotalRejected();

        Assert.assertEquals(HOW_MANY_REJECTED,result);
    }

    @Test public void countIn() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        hanoiRhymer.countIn(1);
        hanoiRhymer.countIn(2);
        hanoiRhymer.countIn(3);

        int result = hanoiRhymer.getTotalRejected();
        final int HOW_MANY_REJECTED = 2;

        Assert.assertEquals(HOW_MANY_REJECTED,result);
    }
}