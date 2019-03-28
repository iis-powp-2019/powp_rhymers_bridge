package edu.kis.vh.nursery.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultRhymersFactoryTest {

    private DefaultRhymersFactory defaultFactory = new DefaultRhymersFactory();
    @Test
    public void getStandardRhymer() {
        assertNotNull(defaultFactory.getStandardRhymer());
    }

    @Test
    public void getFalseRhymer() {
        assertNotNull(defaultFactory.getFalseRhymer());
    }

    @Test
    public void getFIFORhymer() {
        assertNotNull(defaultFactory.getFIFORhymer());
    }

    @Test
    public void getHanoiRhymer() {
        assertNotNull(defaultFactory.getHanoiRhymer());
    }
}