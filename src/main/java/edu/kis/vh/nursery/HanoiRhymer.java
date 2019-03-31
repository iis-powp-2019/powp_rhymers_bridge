package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public HanoiRhymer(Stack stack) {
        super(stack);
        // TODO Auto-generated constructor stub
    }

    protected int reportRejected() {
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
