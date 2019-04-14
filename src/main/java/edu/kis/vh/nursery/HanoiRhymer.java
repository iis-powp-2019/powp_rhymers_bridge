package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntStorageInterface;

/**
 * @author m_kar
 *
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
	}


	public HanoiRhymer(IntStorageInterface intStorageInterface) {
		super(intStorageInterface);
	}

	private int totalRejected = 0;


	/** Return the total amount of rejected values
     * @return amount of rejected values as integer
	 */
	public int reportRejected() {
		return totalRejected;
	}

	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultCountingOutRhymer#countIn(int)
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}

	/**Return the total amount of rejected values
     * @return amount of rejected values as integer
	 */
	public int getTotalRejected() {
		return totalRejected;
	}


}
