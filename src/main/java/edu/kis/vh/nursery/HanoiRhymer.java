package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Interface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final int ZERO = 0;

    private int totalRejected = ZERO;

	public HanoiRhymer(Interface intLinkedList) {
		super(intLinkedList);
	}

	public HanoiRhymer() {
		super();
	}

	public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }

	protected int reportRejected() {
		return getTotalRejected();
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			setTotalRejected(getTotalRejected()+1);
		else
			super.countIn(in);
	}
}
//kombinacja klawiszy alt + <- pozwala na cofnięcie się do poprzednio modyfikowanego pliku
//kombinacja klawiszy alt + -> pozwala na przeniesienie do modyfikowanego pliku przed cofnięciem (zrobienie kroku do przodu)
