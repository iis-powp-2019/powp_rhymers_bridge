package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stackable;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	public FIFORhymer(Stackable stack) {
		super(stack);
	}

	public FIFORhymer() {
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		final int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}
}


//Ctrl + strzalka w lewo porusza się po otwartych klasach wedle historii otworzenia wstecz, a ctrl + strzalka w prawo w przód