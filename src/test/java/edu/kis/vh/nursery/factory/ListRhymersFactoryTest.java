package edu.kis.vh.nursery.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListRhymersFactoryTest {

    private ListRhymersFactory listRhymersFactory = new ListRhymersFactory();

    @Test
    public void getStandardRhymer() {
        assertNotNull(listRhymersFactory.getStandardRhymer());
    }

    @Test
    public void getFalseRhymer() {
        assertNotNull(listRhymersFactory.getFalseRhymer());
    }

    @Test
    public void getFIFORhymer() {
        assertNotNull(listRhymersFactory.getFIFORhymer());
    }

    @Test
    public void getHanoiRhymer() {
        assertNotNull(listRhymersFactory.getHanoiRhymer());
    }
}