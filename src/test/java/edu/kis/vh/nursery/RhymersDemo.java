package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.IRhymersfactory;

class RhymersDemo {

	private static final int FIRST_ELEMENT = 0;
	private static final int SECOND_ELEMENT = 1;
	private static final int THREE = 3;
	private static final int NUMBER_OF_ELEMENTS = 15;
	private static final int RANDOM = 20;

	public static void main(String[] args) {
		IRhymersfactory factory = new DefaultRhymersFactory();
		
		testRhymers(factory);
		
	}

	private static void testRhymers(IRhymersfactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};
		
		for (int i = SECOND_ELEMENT; i < NUMBER_OF_ELEMENTS; i++)
			for (int j = FIRST_ELEMENT; j < THREE; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = SECOND_ELEMENT; i < NUMBER_OF_ELEMENTS; i++)
			rhymers[THREE].countIn(rn.nextInt(RANDOM));
		
		for (int i = FIRST_ELEMENT; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[THREE]).reportRejected());
	}
	
}