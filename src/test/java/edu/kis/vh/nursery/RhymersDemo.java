package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;
import edu.kis.vh.nursery.factory.StackRhymersFactory;

class RhymersDemo {

	public static void main(String[] args) {

		testRhymers(new DefaultRhymersFactory());
		testRhymers(new ListRhymersFactory());
		testRhymers(new StackRhymersFactory());

	}

	public static void testRhymers(Rhymersfactory factory) {
		DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(), factory.getFIFORhymer(),
				factory.getHanoiRhymer()};

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

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());

		System.out.println();
	}

}
