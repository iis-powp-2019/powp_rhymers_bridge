package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCoutingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.Containers.IntArrayStack;
import edu.kis.vh.nursery.Containers.IntLinkedList;

public class ArrayRhymersFactory implements Rhymersfactory {
    @Override
    public DefaultCoutingOutRhymer getStandardRhymer() {
        return new DefaultCoutingOutRhymer(new IntArrayStack());
    }

    @Override
    public DefaultCoutingOutRhymer getFalseRhymer() {
        return new DefaultCoutingOutRhymer(new IntLinkedList());
    }

    @Override
    public DefaultCoutingOutRhymer getFIFORhymer() {
        return new FIFORhymer(new IntArrayStack());
    }

    @Override
    public DefaultCoutingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer(new IntArrayStack());
    }
}