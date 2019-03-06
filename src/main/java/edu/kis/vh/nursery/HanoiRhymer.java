package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
//kombinacja klawiszy alt + <- pozwala na cofnięcie się do poprzednio modyfikowanego pliku
//kombinacja klawiszy alt + -> pozwala na przeniesienie do modyfikowanego pliku przed cofnięciem (zrobienie kroku do przodu)