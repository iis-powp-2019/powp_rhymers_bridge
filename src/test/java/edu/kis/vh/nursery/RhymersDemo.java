package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.ArrayRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

	public static void main(String[] args) {

		RhymersFactory lrf = new ListRhymersFactory();
		RhymersFactory arf = new ArrayRhymersFactory();

		DefaultCountingOutRhymer[] listRhymers = { lrf.getStandardRhymer(), lrf.getFalseRhymer(),
				lrf.getFIFORhymer(), lrf.getHanoiRhymer()};

		DefaultCountingOutRhymer[] arrayRhymers = { arf.getStandardRhymer(), arf.getFalseRhymer(),
				arf.getFIFORhymer(), arf.getHanoiRhymer()};

		testRhymers(listRhymers);
		testRhymers(arrayRhymers);

	}

	private static void testRhymers(DefaultCountingOutRhymer[] rhymers) {
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].countIn(rn.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].isCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
	}
}