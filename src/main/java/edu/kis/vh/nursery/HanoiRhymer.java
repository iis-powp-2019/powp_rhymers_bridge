package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datastructure.BestInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;


    /**
     *
     * @return zwraca totalreject
     */
    public int reportRejected() {
        return getTotalRejected();
    }

    public HanoiRhymer() {
    }

    public HanoiRhymer(BestInterface intLinkedList) {
        super(intLinkedList);
    }

    /**
     *
     * @param in przyjmuje liczbe jaka ma byc dodana do listy
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            setTotalRejected(getTotalRejected() + 1);
        } else {
            super.countIn(in);
        }
    }

    /**
     *
     * @return zwraca totalreject
     */
    public int getTotalRejected() {
        return totalRejected;
    }

    /**
     * pozwala ustawic nowa wartosc totalreject
     * @param totalRejected przyjmuje nowa wartosc totalreject
     */
    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
