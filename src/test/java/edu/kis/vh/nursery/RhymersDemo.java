package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.IRhymersFactory;

class RhymersDemo {

    public static void main(String[] args) {
        IRhymersFactory iRhymersFactory = new DefaultRhymersFactory();

        testRhymers(iRhymersFactory);

    }

    private static void testRhymers(IRhymersFactory iRhymersFactory) {
        DefaultCountingOutRhymer[] defaultCountingOutRhymers = {iRhymersFactory.getStandardRhymer(), iRhymersFactory.getFalseRhymer(),
                iRhymersFactory.getFIFORhymer(), iRhymersFactory.getHanoiRhymer()};

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                defaultCountingOutRhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            defaultCountingOutRhymers[3].countIn(rn.nextInt(20));

        for (int i = 0; i < defaultCountingOutRhymers.length; i++) {
            while (!defaultCountingOutRhymers[i].isFull())
                System.out.print(defaultCountingOutRhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is " + ((HanoiRhymer) defaultCountingOutRhymers[3]).getReportRejected());
    }

}