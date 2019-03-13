package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.IRhymersfactory;

class RhymersDemo {

	private static final int ZERO = 0;
	private static final int ONE = 1;
	private static final int THREE = 3;
	private static final int FIFTEEN = 15;
	private static final int TWENTY = 20;

	public static void main(String[] args) {
		IRhymersfactory factory = new DefaultRhymersFactory();
		
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};
		
		for (int i = ONE; i < FIFTEEN; i++)
			for (int j = ZERO; j < THREE; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = ONE; i < FIFTEEN; i++)
			rhymers[THREE].countIn(rn.nextInt(TWENTY));
		
		for (int i = ZERO; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[THREE]).reportRejected());
		
	}
	
}