package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public HanoiRhymer() {
        super();
    }

    public HanoiRhymer(Collections intLinkedList) {
        super(intLinkedList);
    }

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }

}
