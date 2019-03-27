package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStackInterface;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FIFORhymerJUnitTest {

    private static final int EMPTY_FIFO_VALUE = IntStackInterface.EMPTY;
    private FIFORhymer rhymer;
    private static final int[] VALUES = new int[]{1, 2, 3};

    @Before
    public void initialize(){
        rhymer = new FIFORhymer();
    }

    @Test
    public void countOutTest(){
        for(int value: VALUES){
            rhymer.countIn(value);
        }

        for(int value:VALUES){
            Assert.assertEquals(value, rhymer.countOut());
        }
    }

    @Test
    public void FIFOEmptyOnInitialization(){
        Assert.assertEquals(EMPTY_FIFO_VALUE,rhymer.countOut());
    }
}
