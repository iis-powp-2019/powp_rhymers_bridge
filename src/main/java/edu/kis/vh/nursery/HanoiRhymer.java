package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.Stackable;

/**
 * Klasa zarządzająca dodawaniem wartości do listy
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer() {
	}

	public HanoiRhymer(Stackable stackable) {
		super(stackable);
	}

	/**
	 * @return totalRejected - liczba wartości odrzuconych do dodania
	 */
	int reportRejected() {
		return totalRejected;
	}

	/**
	 * @param in - wartość do dodania do listy
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
