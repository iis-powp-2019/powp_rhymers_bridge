package edu.kis.vh.nursery.stack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class IntArrayStackTest {
    IntArrayStack intArrayStack;

    @Before
    public void setUp() {
        intArrayStack = new IntArrayStack();
    }

    @Test
    public void isEmptyShouldReturnTrueWhenArrayIsEmpty() {
        assertThat(true, is(intArrayStack.isEmpty()));
    }

    @Test
    public void isEmptyShouldReturnFalseWhenArrayIsNotEmpty() {
        intArrayStack.push(1);
        assertThat(false, is(intArrayStack.isEmpty()));
    }

    @Test
    public void isFullShouldReturnTrueWhenArrayIsFull() {
        for (int i = 0; i < intArrayStack.getCAPACITY(); i++)
            intArrayStack.push(i);
        assertThat(true, is(intArrayStack.isFull()));
    }

    @Test
    public void isFullShouldReturnFalseWhenArrayIsNotFull() {
        intArrayStack.push(1);
        assertThat(false, is(intArrayStack.isFull()));
    }

    @Test
    public void topShouldReturnZeroIfArrayIsEmpty() {
        assertThat(0, is(intArrayStack.top()));
    }

    @Test
    public void topShouldReturnOneWhenOneIsOnTop() {
        intArrayStack.push(3);
        intArrayStack.push(2);
        intArrayStack.push(1);

        assertThat(1, is(intArrayStack.top()));
    }

    @Test
    public void popShouldReturnZeroWhenArrayIsEmpty() {
        assertThat(0, is(intArrayStack.pop()));
    }

    @Test
    public void popShouldReturnOneWhenOneIsOnTop() {
        intArrayStack.push(3);
        intArrayStack.push(2);
        intArrayStack.push(1);

        assertThat(1, is(intArrayStack.pop()));
    }

    @Test
    public void pushShouldNotAddIfArrayIsFull() {
        for (int i = 0; i < intArrayStack.getCAPACITY(); i++)
            intArrayStack.push(i);
        intArrayStack.push(32);
        assertThat(32, not(intArrayStack.isFull()));
    }
}
