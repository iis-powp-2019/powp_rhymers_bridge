package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

/**
 * Base class,start point of a whole program
 */
class RhymersDemo {

    public static final int MAX_SIZE = 3;
    public static final int SIZE = 15;

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();
        testRhymers(factory);

    }

    private static void testRhymers(RhymersFactory factory) {
        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = 1; i < getSIZE(); i++)
            for (int j = 0; j < getMaxSize(); j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < getSIZE(); i++)
            rhymers[getMaxSize()].countIn(rn.nextInt(20));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[getMaxSize()]).reportRejected());
    }


    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getSIZE() {
        return SIZE;
    }
}
