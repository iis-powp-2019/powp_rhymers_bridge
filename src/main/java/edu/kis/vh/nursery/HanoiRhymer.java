package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	int totalRejected = 0; //formatowanie kodu: brak wcięcia

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
		totalRejected++; //formatowanie kodu: za duże wcięcie
	else //formatowanie kodu: za duże wcięcie x2
		super.countIn(in); //formatowanie kodu: za duże wcięcie x2
	}
}
