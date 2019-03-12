package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HanoiRhymerTest {

    @Test public void reportRejected() {
        final int COUNT_OF_REJECTED = 0;
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        hanoiRhymer.countIn(5);
        hanoiRhymer.countIn(4);
        hanoiRhymer.countIn(3);
        hanoiRhymer.countIn(2);
        hanoiRhymer.countIn(1);

        int result = hanoiRhymer.reportRejected();

        Assert.assertEquals(COUNT_OF_REJECTED, result);
    }

    @Test public void countIn() {
        final int COUNT_OF_REJECTED = 4;
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        hanoiRhymer.countIn(1);
        hanoiRhymer.countIn(2);
        hanoiRhymer.countIn(3);
        hanoiRhymer.countIn(4);
        hanoiRhymer.countIn(5);

        int result = hanoiRhymer.reportRejected();

        Assert.assertEquals(COUNT_OF_REJECTED, result);

    }
}

