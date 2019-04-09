package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	private static final int COUNT_IN_AMOUNT_LIMIT = 15;

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();

		testRhymers(factory);

	}

	private static void testRhymers(Rhymersfactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (int i = 1; i < COUNT_IN_AMOUNT_LIMIT; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < COUNT_IN_AMOUNT_LIMIT; i++)
			rhymers[3].countIn(rn.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
	}

}