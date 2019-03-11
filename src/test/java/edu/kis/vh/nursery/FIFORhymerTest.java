package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerTest {

    @Test
    public void FIFORhymerTestShouldReturnCorrectValues(){

        FIFORhymer fifoRhymer = new FIFORhymer();
        final int[] TEST_VALUES = {6,5,4,3,2,1};

        for (int test_value : TEST_VALUES) {
            fifoRhymer.countIn(test_value);
        }

        for (int test_value : TEST_VALUES) {
            Assert.assertEquals(test_value, fifoRhymer.countOut());
        }

    }

    @Test
    public void FIFORhymerTestShouldReturnIncorrectValues(){

        FIFORhymer fifoRhymer = new FIFORhymer();
        final int[] TEST_VALUES = {6,5,4,3,2,1};
        final int[] RETURN_VALUES = {6,5,4,3,1,2};

        for (int test_value : TEST_VALUES) {
            fifoRhymer.countIn(test_value);
        }

        for(int i=0; i<TEST_VALUES.length; i++){
            Assert.assertNotEquals(RETURN_VALUES,fifoRhymer.countOut());
        }

    }

}
