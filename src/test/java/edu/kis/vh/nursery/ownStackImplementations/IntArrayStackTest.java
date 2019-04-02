package edu.kis.vh.nursery.ownStackImplementations;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class IntArrayStackTest {

    @Test
    public void testPushAndPop() {
        IntArrayStack intArrayStack = new IntArrayStack();
        int val = 10;
        intArrayStack.push(val);
        int result = intArrayStack.pop();
        assertThat(val, is(result));
    }

    @Test
    public void testIsFullShouldReturnFalse() {
        IntArrayStack intArrayStack = new IntArrayStack();
        for (int i = 0; i < 10; i++) {
            intArrayStack.push(i);
        }
        assertThat(false, is(intArrayStack.isFull()));
    }
    @Test
    public void testPeek() {
        IntArrayStack intArrayStack = new IntArrayStack();
        for (int i = 0; i < 10; i++) {
            intArrayStack.push(i);
        }
        assertThat(9, is(intArrayStack.peek()));
    }


    @Test
    public void testIsFullShouldReturnTrue() {
        IntArrayStack intArrayStack = new IntArrayStack();
        int val = 10;
        intArrayStack.push(val);
        int result = intArrayStack.pop();
        assertThat(val, is(result));
    }

}