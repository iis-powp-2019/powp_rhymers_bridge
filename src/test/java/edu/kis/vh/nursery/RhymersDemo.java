package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;
import edu.kis.vh.nursery.factory.ArrayStackRhymersFactory;
import edu.kis.vh.nursery.factory.ListStackRhymersFactory;

class RhymersDemo {

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();
		Rhymersfactory arrayFactory = new ArrayStackRhymersFactory();
		Rhymersfactory listFactory = new ListStackRhymersFactory();
		
		testRhymers(factory);
		testRhymers(arrayFactory);
		testRhymers(listFactory);
	}

	private static void testRhymers(Rhymersfactory factory) {

		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer() };

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].countIn(rn.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((HanoiRhymer) rhymers[3]).reportRejected());

	}

}