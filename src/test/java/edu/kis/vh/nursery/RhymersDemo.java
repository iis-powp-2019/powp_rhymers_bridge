package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.ArrayRhymersFactory;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

import java.util.ArrayList;
import java.util.List;

class RhymersDemo {

    public static void main(String[] args) {
        List<RhymersFactory> factories = new ArrayList<>();
        factories.add(new ArrayRhymersFactory());
        factories.add(new ListRhymersFactory());
        factories.add(new DefaultRhymersFactory());

        factories.forEach(RhymersDemo::testRhymers);
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
