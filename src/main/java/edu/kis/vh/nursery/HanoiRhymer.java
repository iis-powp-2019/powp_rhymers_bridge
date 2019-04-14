package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer()
	{

	}

	public HanoiRhymer(int totalRejected)
	{
		this.totalRejected = totalRejected;
	}

	public HanoiRhymer(IntLinkedList intCounter, int totalRejected)
	{
		super(intCounter);
		this.totalRejected = totalRejected;
	}

	public int reportRejected() {
		return totalRejected;
	}

    @Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			setTotalRejected(reportRejected() + 1);
		else
			super.push(in);
	}

    private void setTotalRejected(int totalRejected)
    {
        this.totalRejected = totalRejected;
    }
}
//1) źle sformatowane linie 5, 12, 14, 15
//3) alt + strzałki zmienia przeglądany plik na ten na prawo lub lewo z paska z otwartymi plikami