package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

    @Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			setTotalRejected(reportRejected() + 1);
		else
			super.countIn(in);
	}

    public void setTotalRejected(int totalRejected)
    {
        this.totalRejected = totalRejected;
    }
}
//1) źle sformatowane linie 5, 12, 14, 15
//3) alt + strzałki zmienia przeglądany plik na ten na prawo lub lewo z paska z otwartymi plikami