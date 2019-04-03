package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(Stackable stackable, int totalRejected) {
        super(stackable);
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(Stackable stackable) {
        super(stackable);
    }

    public HanoiRhymer() {

    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void push(int in) {
        if (!isEmpty() && in > top())
            totalRejected++;
        else
            super.push(in);
    }
}
