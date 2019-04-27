package edu.kis.vh.nursery;

import edu.kis.vh.nursery.RhymersStacks.IntArrayStack;
import edu.kis.vh.nursery.RhymersStacks.IntLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FIFORhymerTest {

    private FIFORhymer fifoStack;
    private FIFORhymer fifoList;
    private int value;

    @Before public void setUp() throws Exception {
        fifoList = new FIFORhymer(new IntLinkedList());
        fifoStack = new FIFORhymer(new IntArrayStack());
    }

    @Test public void countOutForEmptyListReturnMinusOne() {
        assertThat(fifoList.countOut(),is(-1));
    }

    @Test public void countOutForEmptyStackReturnMinusOne() {
        assertThat(fifoStack.countOut(),is(-1));
    }

    @Test public void countOutForStackWithOneValueReturnTheValue() {
        value = 10;
        fifoStack.countIn(value);
        assertThat(fifoStack.countOut(),is(value));
    }

    @Test public void countOutForListWithOneValueReturnTheValue() {
        value = -1;
        fifoList.countIn(value);
        assertThat(fifoList.countOut(),is(value));
    }

    @Test public void countOutForStackWithTwoValuesReturnFirstValue() {
        value = -111;
        fifoStack.countIn(value);
        fifoStack.countIn(-10);
        assertThat(fifoStack.countOut(),is(value));
    }

    @Test public void countOutForListWithTwoValuesReturnFirstValue() {
        value = 20;
        fifoList.countIn(value);
        fifoList.countIn(-3);
        assertThat(fifoList.countOut(),is(value));
    }
}
