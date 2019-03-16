package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0; //formatowanie kodu: brak wcięcia

	public int reportRejected() {
		return getTotalRejected();
	}

	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
		setTotalRejected(getTotalRejected() + 1); //formatowanie kodu: za duże wcięcie
	else //formatowanie kodu: za duże wcięcie x2
		super.countIn(in); //formatowanie kodu: za duże wcięcie x2
	}

	public int getTotalRejected() {
		return totalRejected;
	}

	public void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}
