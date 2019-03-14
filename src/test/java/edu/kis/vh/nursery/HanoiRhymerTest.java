package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {


    @Test public void countIn() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();

        int countRejected = 2;

        hanoiRhymer.countIn(1);
        hanoiRhymer.countIn(2);
        hanoiRhymer.countIn(3);

        Assert.assertEquals(countRejected, hanoiRhymer.reportRejected());
    }

    @Test public void reportRejected() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();

        int countRejected = 0;

        hanoiRhymer.countIn(3);
        hanoiRhymer.countIn(2);
        hanoiRhymer.countIn(1);

        Assert.assertEquals(countRejected, hanoiRhymer.reportRejected());
    }

}