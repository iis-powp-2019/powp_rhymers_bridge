package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.StackInterface;

/**
 * @author Delicja05
 *
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(StackInterface intLinkedList) {
		super(intLinkedList);
	}

	/**
	 * @return dzialanie metody getTotalRejected()
	 */
	protected int reportRejected() {
		return getTotalRejected();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultCountingOutRhymer#countIn(int)
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			setTotalRejected(getTotalRejected() + 1);
		else
			super.countIn(in);
	}

	/**
	 * Metoda dostepu do pola totalRejected
	 * @return pole totalRejected
	 */
	int getTotalRejected() {
		return totalRejected;
	}

	/**
	 * Ustawienie pola totalRejected
	 * @param totalRejected
	 */
	void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}
