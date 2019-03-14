package edu.kis.vh.nursery;

import org.junit.Test;

import static org.junit.Assert.*;

public class HanoiRhymerTest {

    @Test
    public void reportRejected() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        int firstValue = 5;
        int nextValue = 3;
        int wrongValue = 4;
        hanoiRhymer.countIn(firstValue);
        hanoiRhymer.countIn(nextValue);
        hanoiRhymer.countIn(wrongValue);
        assertEquals(hanoiRhymer.totalRejected, 1);
    }

    @Test
    public void countIn() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        int firstValue = 5;
        int nextValue = 3;
        int wrongValue = 4;
        hanoiRhymer.countIn(firstValue);
        hanoiRhymer.countIn(nextValue);
        hanoiRhymer.countIn(wrongValue);
        int peekaboo = hanoiRhymer.peekaboo();
        assertEquals(peekaboo, nextValue);
    }
}