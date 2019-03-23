package edu.kis.vh.nursery;

/**
 * Klasa zarządzająca dodawaniem wartości do listy
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

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
