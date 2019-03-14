package edu.kis.vh.nursery;

import com.sun.source.tree.AssertTree;
import org.graalvm.compiler.debug.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FIFORhymerTest {

    private FIFORhymer fifo = new FIFORhymer();
    @Test
    public void countOut() {
        assertEquals(fifo.countOut(),-1);
    }
}