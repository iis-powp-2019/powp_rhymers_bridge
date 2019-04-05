package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;
import edu.kis.vh.nursery.factory.StackRhymersFactory;

class RhymersDemo {

	public static final int PIETNASCIE = 15;
	public static final int TRZY = 3;
	public static final int JEDEN = 1;

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();

		testRhymers(factory);
		Rhymersfactory factory2 = new ListRhymersFactory();
		testRhymers(factory2);
		Rhymersfactory factory3 = new StackRhymersFactory();
		testRhymers(factory3);

	}

	private static void testRhymers(Rhymersfactory factory) {
		DefaultCountingOutRhymer[] rhymers = { //formatowanie kodu: automat chce inaczej, ja lubię tak...
			factory.getStandardRhymer(), factory.getFalseRhymer(),
			factory.getFIFORhymer(), factory.getHanoiRhymer()
		};

		for (int i = JEDEN; i < PIETNASCIE; i++)
			for (int j = 0; j < TRZY; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = JEDEN; i < PIETNASCIE; i++)
			rhymers[3].countIn(rn.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[TRZY]).reportRejected());
	}


}