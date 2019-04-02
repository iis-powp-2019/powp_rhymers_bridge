package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.ArrayRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

import java.util.Random;

class RhymersDemo {

    public static void main(String[] args) {
        RhymersFactory arrayFactory = new ArrayRhymersFactory();
        RhymersFactory listFactory = new ListRhymersFactory();

        testRhymers(arrayFactory, listFactory);
    }

    private static void testRhymers(RhymersFactory arrayFactory, RhymersFactory listFactory) {
        DefaultCountingOutRhymer[] arrayRhymers = {arrayFactory.getStandardRhymer(), arrayFactory.getFalseRhymer(),
                arrayFactory.getFIFORhymer(), arrayFactory.getHanoiRhymer()};
        countInAllRhymers(arrayRhymers);
        generateNumbersForCountInForHanoiRhymer(arrayRhymers[3]);
        countOutAllRhymers(arrayRhymers);
        System.out.println("total rejected is " + ((HanoiRhymer) arrayRhymers[3]).reportRejected());

        DefaultCountingOutRhymer[] listRhymers = {listFactory.getStandardRhymer(), listFactory.getFalseRhymer(),
                listFactory.getFIFORhymer(), listFactory.getHanoiRhymer()};
        countInAllRhymers(listRhymers);
        generateNumbersForCountInForHanoiRhymer(listRhymers[3]);
        countOutAllRhymers(listRhymers);
        System.out.println("total rejected is " + ((HanoiRhymer) listRhymers[3]).reportRejected());
    }

    private static void countOutAllRhymers(DefaultCountingOutRhymer[] rhymers) {
        for (DefaultCountingOutRhymer rhymer : rhymers) {
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
