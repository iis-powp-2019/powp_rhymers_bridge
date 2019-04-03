package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.datastructure.IntArrayStack;
import edu.kis.vh.nursery.datastructure.IntLinkedList;

public class RhymersFactoryList implements Rhymersfactory {

    @Override
    final public DefaultCountingOutRhymer GetStandardRhymer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    @Override
    final public DefaultCountingOutRhymer GetFalseRhymer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    @Override
    final public DefaultCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer(new IntLinkedList());
    }

    @Override
    final public DefaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer(new IntLinkedList());
    }

}
