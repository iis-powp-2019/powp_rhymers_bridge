package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {
    HanoiRhymer rhymer = new HanoiRhymer();

    @Test
    public void testCountIn() {
        rhymer.countIn(5);
        rhymer.countIn(10);
        Assert.assertEquals(1, rhymer.reportRejected());
    }
}