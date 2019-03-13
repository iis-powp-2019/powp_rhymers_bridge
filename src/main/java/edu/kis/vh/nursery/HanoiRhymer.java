package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final int ZERO = 0;

    private int totalRejected = ZERO;

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }

	protected int reportRejected() {
		return getTotalRejected();
	}

	protected void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			setTotalRejected(getTotalRejected()+1);
		else
			super.countIn(in);
	}
}
//kombinacja klawiszy alt + <- pozwala na cofnięcie się do poprzednio modyfikowanego pliku
//kombinacja klawiszy alt + -> pozwala na przeniesienie do modyfikowanego pliku przed cofnięciem (zrobienie kroku do przodu)
