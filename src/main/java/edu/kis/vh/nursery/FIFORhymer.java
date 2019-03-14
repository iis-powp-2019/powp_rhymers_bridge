package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCoutingOutRhymer {

	public final DefaultCoutingOutRhymer temp = new DefaultCoutingOutRhymer();

    /**
     * method iterates through stack and returns first element
     * @return First element in list
     */
	@Override
	protected int countOut() {
		while (!callCheck())

			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}
}
