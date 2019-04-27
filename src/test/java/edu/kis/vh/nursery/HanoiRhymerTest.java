package edu.kis.vh.nursery;

import edu.kis.vh.nursery.RhymersStacks.IntArrayStack;
import edu.kis.vh.nursery.RhymersStacks.IntLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HanoiRhymerTest {

    private HanoiRhymer hanoiRhymerIntArrayStack;
    private HanoiRhymer hanoiRhymerIntLinkedList;
    private int value;

    @Before public void setUp() throws Exception {
        hanoiRhymerIntArrayStack = new HanoiRhymer(new IntArrayStack());
        hanoiRhymerIntLinkedList = new HanoiRhymer(new IntLinkedList());
    }

    @Test public void countOutForEmptyArrayStackReturnZero() {
        assertThat(hanoiRhymerIntArrayStack.countOut(),is(0));
    }

    @Test public void countOutForEmptyLinkedListReturnMinusOne() {
        assertThat(hanoiRhymerIntLinkedList.countOut(),is(-1));
    }

    @Test public void countOutForArrayStackWithOneValueReturnTheValue() {
        value = 5;
        hanoiRhymerIntArrayStack.countIn(value);
        assertThat(hanoiRhymerIntArrayStack.countOut(),is(value));
    }

    @Test public void countInForLinkedListWithOneValueReturnTheValue() {
        value = 10;
        hanoiRhymerIntLinkedList.countIn(value);
        assertThat(hanoiRhymerIntLinkedList.countOut(),is(value));
    }

    @Test public void countOutForArrayStackWithTwoValuesReturnLastValue() {
        value = -10;
        hanoiRhymerIntArrayStack.countIn(5);
        hanoiRhymerIntArrayStack.countIn(value);
        assertThat(hanoiRhymerIntArrayStack.countOut(),is(value));
    }

    @Test public void countOutForLinkedListWithTwoValuesReturnLastValue() {
        value = -15;
        hanoiRhymerIntLinkedList.countIn(5);
        hanoiRhymerIntLinkedList.countIn(value);
        assertThat(hanoiRhymerIntLinkedList.countOut(),is(value));
    }
}
