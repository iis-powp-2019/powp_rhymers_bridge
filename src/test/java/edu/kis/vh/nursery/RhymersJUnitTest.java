package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {
    @Test public void testCountIn() {

        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedList());
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }


        @Test public void testCallCheck() {
            DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedList());
            boolean result = rhymer.callCheck();
            Assert.assertEquals(true, result);

            rhymer.countIn(888);

            result = rhymer.callCheck();
            Assert.assertEquals(false, result);
        }

        @Test public void testIsFull() {
            DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedList());
            final int STACK_CAPACITY = 12;
            for (int i = 0; i < STACK_CAPACITY; i++) {
                boolean result = rhymer.isFull();
                Assert.assertEquals(false, result);
                rhymer.countIn(888);
            }

            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
        }

        @Test public void testPeekaboo() {
            DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedList());
            final int EMPTY_STACK_VALUE = StructureValue.getMinTotalValue();

            int result = rhymer.peekaboo();
            Assert.assertEquals(EMPTY_STACK_VALUE, result);

            int testValue = 4;
            rhymer.countIn(testValue);

            result = rhymer.peekaboo();
            Assert.assertEquals(testValue, result);
            result = rhymer.peekaboo();
            Assert.assertEquals(testValue, result);
        }

        @Test public void testCountOut() {
            DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedList());
            final int EMPTY_STACK_VALUE = StructureValue.getMinTotalValue();

            int result = rhymer.countOut();
            Assert.assertEquals(EMPTY_STACK_VALUE, result);

            int testValue = 4;
            rhymer.countIn(testValue);

            result = rhymer.countOut();
            Assert.assertEquals(testValue, result);
            result = rhymer.countOut();
            Assert.assertEquals(EMPTY_STACK_VALUE, result);
        }

    @Test public void testFIFORhymerCountOut(){
        FIFORhymer fifoRhymer = new FIFORhymer();
        final int EMPTY_STACK_VALUE = StructureValue.getMinTotalValue();

        int result = fifoRhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

    }

   @Test public void testHanioRhymerCountIn(){
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        int testValue = 4;

        hanoiRhymer.countIn(testValue);
        int result = hanoiRhymer.peekaboo();
        Assert.assertEquals(testValue,result);

   }
}
