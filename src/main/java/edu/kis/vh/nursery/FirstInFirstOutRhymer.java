package edu.kis.vh.nursery;

public class FirstInFirstOutRhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

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
//Kombinacja ctrl+alt+ strzałka w lewo sprawia, że przechodzimy wstecz po histori aktualnie otwartych kart, z kolei ctrl + alt + strzałka w prawo idzie do przodu w kolejości otwartych kart.
