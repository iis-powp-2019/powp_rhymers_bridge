package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;


    /**
     *
     * @return zwraca totalreject
     */
    public int reportRejected() {
        return getTotalRejected();
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
