package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}
}
//alt + strzałka w lewo
//cofa się do poprzedniej edycji w projekcie
//alt + strzałka w prawo
//przemieszcza się do następnej edycji w projekcie