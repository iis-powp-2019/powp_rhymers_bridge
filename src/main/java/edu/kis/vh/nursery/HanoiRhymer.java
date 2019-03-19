package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer rozszerza klase DefaultCountingOutRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

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
