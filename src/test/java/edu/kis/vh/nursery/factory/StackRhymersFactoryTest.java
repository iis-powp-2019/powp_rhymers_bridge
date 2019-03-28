package edu.kis.vh.nursery.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackRhymersFactoryTest {

    private StackRhymersFactory stackRhymersFactory = new StackRhymersFactory();

    @Test
    public void getStandardRhymer() {
        assertNotNull(stackRhymersFactory.getStandardRhymer());
    }

    @Test
    public void getFalseRhymer() {
        assertNotNull(stackRhymersFactory.getFalseRhymer());
    }

    @Test
    public void getFIFORhymer() {
        assertNotNull(stackRhymersFactory.getFIFORhymer());
    }

    @Test
    public void getHanoiRhymer() {
        assertNotNull(stackRhymersFactory.getHanoiRhymer());
    }
}