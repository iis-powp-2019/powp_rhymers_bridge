package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;
import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.Node;
class RhymersDemo {

	private static final int stat = 15;

	public static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();
		
		testRhymers(factory);

	}
	//Skróty Alt + -> oraz Alt + <- slużą do zmiamy plików otwartych w IDE

	private static void testRhymers(RhymersFactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer() };

		for (int i = 1; i < stat; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		java.util.Random rand = new java.util.Random();
		for (int i = 1; i < stat; i++)
			rhymers[3].countIn(rand.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((HanoiRhymer) rhymers[3]).reportRejected());
	}
	
}