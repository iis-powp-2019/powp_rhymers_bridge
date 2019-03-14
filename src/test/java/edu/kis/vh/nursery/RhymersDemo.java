package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

import java.util.Random;

class RhymersDemo {

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();
        testRhymers(factory);
    }

    private static void testRhymers(RhymersFactory factory) {
        DefaultCountingOutRhymer[] rhymers = {
                factory.GetStandardRhymer(),
                factory.GetFalseRhymer(),
                factory.GetFIFORhymer(),
                factory.GetHanoiRhymer()
        };

        for (int index = 1; index < 15; index++)
            for (int rhymerIndex = 0; rhymerIndex < 3; rhymerIndex++)
                rhymers[rhymerIndex].countIn(index);

        Random random = new Random();
        for (int index = 1; index < 15; index++)
            rhymers[3].countIn(random.nextInt(20));

        for (DefaultCountingOutRhymer rhymer : rhymers) {
            while (!rhymer.callCheck())
                System.out.print(rhymer.countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportOfRejected());
    }

}