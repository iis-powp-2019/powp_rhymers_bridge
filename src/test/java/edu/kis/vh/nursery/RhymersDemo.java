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
        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(), factory.getFIFORhymer(),
                factory.getHanoiRhymer()};
        countInAllRhymers(rhymers);
        generateNumbersForCountInForHanoiRhymer(rhymers[3]);
        countOutAllRhymers(rhymers);
        System.out.println("total rejected is " + ((HanoiRhymer) rhymers[3]).reportRejected());
    }

    private static void countOutAllRhymers(DefaultCountingOutRhymer[] rhymers) {
        for (DefaultCountingOutRhymer rhymer: rhymers) {
            while (!rhymer.callCheck()) {
                System.out.print(rhymer.countOut() + "  ");
            }
            System.out.println();
        }

    }

    private static void generateNumbersForCountInForHanoiRhymer(DefaultCountingOutRhymer rhymer) {
        Random random = new Random();
        for (int i = 1; i < 15; i++) {
            rhymer.countIn(random.nextInt(20));
        }
    }

    private static void countInAllRhymers(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                rhymers[j].countIn(i);
            }
        }
    }
}
