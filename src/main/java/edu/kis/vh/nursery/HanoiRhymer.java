package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stackable;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(Stackable stack) {
		super(stack);
	}

	private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//Ctrl + strzałka w lewo wraca po historii otwieranych klas, a ctrl + strzałka w prawo idzie do najnowszej otworzonej karty
