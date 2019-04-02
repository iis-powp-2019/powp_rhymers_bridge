package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.ArrayRhymersFactory;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RhymersDemo {

    public static void main(String[] args) {
        List<RhymersFactory> rhymersList = new ArrayList<>(Arrays.asList(new DefaultRhymersFactory(),new ArrayRhymersFactory(), new ListRhymersFactory()));
        for(int i=0;i<rhymersList.size();i++){
            testRhymers(rhymersList.get(i));
        }
    }

    private static void testRhymers(RhymersFactory factory) {
        final int RANDOM_BOUND = 20;
        final int INDEX_HANOI_RHYMER = 3;
        final int ARRAY_SIZE = 3;
        final int NUMBER_OF_ELEMENTS_TO_ADD = 15;

        final DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(), factory.getFIFORhymer(),
                factory.getHanoiRhymer()};

        for (int i = 1; i < NUMBER_OF_ELEMENTS_TO_ADD; i++)
            for (int j = 0; j < ARRAY_SIZE; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < NUMBER_OF_ELEMENTS_TO_ADD; i++)
            rhymers[INDEX_HANOI_RHYMER].countIn(rn.nextInt(RANDOM_BOUND));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is " + ((HanoiRhymer) rhymers[INDEX_HANOI_RHYMER]).reportRejected());
    }
}
