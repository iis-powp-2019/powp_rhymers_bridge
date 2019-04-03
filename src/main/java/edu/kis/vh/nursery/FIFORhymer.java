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
	public int pop() {
		while (!isEmpty())
			getTemp().push(super.pop());
		
		int ret = getTemp().pop();
		
		while (!getTemp().isEmpty())
			push(getTemp().pop());
		
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
