package edu.kis.vh.nursery;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FIFORhymerTest {
    private FIFORhymer rhymer;

    @Before
    public void init(){
        rhymer = new FIFORhymer();
    }

    @After
    public void teardown() { rhymer = null;}

    @Test
    public void testCountOutEmptyList(){
        int test = rhymer.countOut();
        Assert.assertEquals(-1, test);
    }

    @Test
    public void testCountOutNonEmptyList(){
        rhymer.countIn(5);
        Assert.assertEquals(5, rhymer.countOut());
    }
}
