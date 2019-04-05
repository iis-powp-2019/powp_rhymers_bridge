package edu.kis.vh.nursery;
import edu.kis.vh.nursery.collection.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(IntLinkedList intArrayStack) {
        super(intArrayStack);
    }

    public HanoiRhymer() {
    }

    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!intArrayStack.isEmpty() && in > intArrayStack.top())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//alt+-> zmienia okna w środowisku intellij