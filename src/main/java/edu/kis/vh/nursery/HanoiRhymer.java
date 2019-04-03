package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datastructures.IIntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer() {
    }

    public HanoiRhymer(IIntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    /**
     * Zwraca całkowitą liczbę odrzuconych wartości
     * @return int
     */
    public int reportRejected() {
        return getTotalRejected();
    } //TODO:reportRejected zwraca to samo co getTotalRejected
    /**
     * Dodaje wartość do tablicy jeżeli tablica nie jest pełna w przeciwnym wypadku zwiększa wartość totalRejected
     ** @param in wartość którą chcemy dodać do listy
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
