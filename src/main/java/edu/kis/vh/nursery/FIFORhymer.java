package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!isEmpty())

			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.isEmpty())

			countIn(temp.countOut());

		return ret;
	}
}
// skroty alt + strzałka pozwalaja na przesuwanie sie pomiedzy kartami