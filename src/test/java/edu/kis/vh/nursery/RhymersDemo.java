package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();

        testRhymers(factory);
    }

    private static void testRhymers(RhymersFactory factory) {
        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(), factory.getFIFORhymer(),
                factory.getHanoiRhymer()};

        putValuesToRhymers(rhymers);
        randomValuesToHanoiRhymer(rhymers[3]);
        printElementsOfRhymers(rhymers);
        printRejectedValuesFromHanoiRhymer(rhymers[3]);
    }

    private static void printRejectedValuesFromHanoiRhymer(DefaultCountingOutRhymer rhymer) {
        System.out.println("total rejected is " + ((HanoiRhymer) rhymer).reportRejected());
    }

    private static void printElementsOfRhymers(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].isEmpty())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
    }

    private static void putValuesToRhymers(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);
    }

    private static void randomValuesToHanoiRhymer(DefaultCountingOutRhymer rhymer) {
        java.util.Random random = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymer.countIn(random.nextInt(20));
    }

}
