package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		int ret = temp.countOut();

		while (!callCheck())
			temp.countIn(super.countOut());

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}
}
