package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	public static final String TOTAL_REJECTED_IS = "total rejected is ";

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();
		testRhymers(factory);
	}

	private static void testRhymers(Rhymersfactory factory)
	{
		DefaultCountingOutRhymer[] rhymers = {
			factory.GetStandardRhymer(),
			factory.GetFalseRhymer(),
			factory.GetFIFORhymer(),
			factory.GetHanoiRhymer()
		};

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].push(rn.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].isEmpty())
				System.out.print(rhymers[i].pop() + "  ");
			System.out.println();
		}

		System.out.println(TOTAL_REJECTED_IS + ((HanoiRhymer) rhymers[3]).reportRejected());
	}

}