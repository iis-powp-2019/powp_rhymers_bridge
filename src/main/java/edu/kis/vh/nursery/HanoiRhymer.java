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
//1) źle sformatowane linie 5, 12, 14, 15
//3) alt + strzałki zmienia przeglądany plik na ten na prawo lub lewo z paska z otwartymi plikami