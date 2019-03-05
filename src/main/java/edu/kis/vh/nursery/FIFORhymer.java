package edu.kis.vh.nursery;
//CTRL-SHIFT-BACKSPACE for going to last edited line
public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

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
