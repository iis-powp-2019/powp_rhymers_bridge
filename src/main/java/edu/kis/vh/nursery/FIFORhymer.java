package edu.kis.vh.nursery;

/**
 * FIFORhymer extends defaultCountingOutRhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	/**
	 * countOut
	 * @return
	 */
	@Override
	public int countOut() {
		while (!callCheck())
			getTemp().countIn(super.countOut());
		
		int ret = getTemp().countOut();
		
		while (!getTemp().callCheck())
			countIn(getTemp().countOut());
		
		return ret;
	}

	/**
	 * getTemp
	 * @return
	 */
	public DefaultCountingOutRhymer getTemp()
	{
		return temp;
	}
}
