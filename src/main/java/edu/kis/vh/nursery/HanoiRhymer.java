package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IIntStack;
import edu.kis.vh.nursery.stacks.IntLinkedList;

/**
 * Klasa HanoiRhymer rozszerza klase DefaultCountingOutRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer(IIntStack iIntStack) {
		super(iIntStack);
	}

	public HanoiRhymer() {
		super();
	}

	/**Metoda zwraca nam wartosc int totalRejected
	 *
	 * @return totalRejected
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/**
	 * Sprawdza czy liczba wieksza od peekaboo()
	 * @param in oznacza liczbe do sprawdzenia
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
