package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.dataStructures.IntArrayStack;
import edu.kis.vh.nursery.dataStructures.IntLinkedList;

public class ListRhymersFactory implements  IRhymersFactory{

    @Override public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    @Override public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer(new IntLinkedList());
    }

    @Override public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer(new IntLinkedList());
    }
}
